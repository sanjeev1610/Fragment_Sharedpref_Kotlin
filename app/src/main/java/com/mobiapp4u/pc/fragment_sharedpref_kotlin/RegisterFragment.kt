package com.mobiapp4u.pc.fragment_sharedpref_kotlin

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_register.view.*

class RegisterFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_register,container,false)

        view.button_register_reg.setOnClickListener {
            var srpf = activity!!.getSharedPreferences("myData", Context.MODE_PRIVATE)
            var edit = srpf.edit()
            edit.putString("email",view.editText_email_reg.text.toString())
            edit.putString("pwd",view.editText_pwd_reg.text.toString())
            edit.apply()

            val fManager = activity!!.supportFragmentManager
            val txn = fManager.beginTransaction()
            txn.replace(R.id.frag1,LoginFragment())
            txn.commit()

        }



        return view
    }

}