package com.mobiapp4u.pc.fragment_sharedpref_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fMangaer = supportFragmentManager
        val txn = fMangaer.beginTransaction()
        txn.add(R.id.frag1,LoginFragment())
        txn.commit()
    }
}
