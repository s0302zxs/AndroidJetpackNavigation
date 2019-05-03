package com.giles.navigationtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //test deep link code
//        val data = Uri.parse("http://www.giles.com/test")
//        val intent = Intent(Intent.ACTION_VIEW, data)
//        startActivity(intent)
    }
}
