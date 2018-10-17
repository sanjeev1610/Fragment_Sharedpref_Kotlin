package com.mobiapp4u.pc.fragment_sharedpref_kotlin

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_login,container,false)

        view.button_login.setOnClickListener {
            var srpf = activity!!.getSharedPreferences("myData",Context.MODE_PRIVATE)
            val email1 = view.editText_email.text.toString()
            val pwd1 = view.editText_pwd.text.toString()
            val email2 = srpf.getString("email","iare0037@gmail.com")
            val pwd2 = srpf.getString("pwd","12345")
            if(email1 == email2 && pwd1 == pwd2){
                val fManager = activity!!.supportFragmentManager
                val txn = fManager.beginTransaction()
                txn.replace(R.id.frag1,WelcomeFragment())
                txn.commit()

            }else{
                Toast.makeText(activity,"Authentication Failed or Not found",Toast.LENGTH_LONG).show()
            }
        }
        view.button_register.setOnClickListener {
            val fManager = activity!!.supportFragmentManager
            val txn = fManager.beginTransaction()
            txn.replace(R.id.frag1,RegisterFragment())
            txn.commit()
        }


        return view
    }

}