package com.tauzeni.leaveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
//   var signup_btn = (Button) findViewById(R.id.signup_btn)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    signup_btn.setOnClickListener {
        var i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
    }
}
