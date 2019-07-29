package com.tauzeni.leaveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    val spinner2: Spinner? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        addItemsOnSpinner2()
        addItemsOnGender()
    }

    fun addItemsOnSpinner2() {
        val spinner1 = findViewById(R.id.spinner1) as Spinner
        val list = ArrayList<String>()
        list.add("Admin")
        list.add("Headmaster")
        list.add("Teacher")
    }

    fun addItemsOnGender() {
        val spinner2 = findViewById(R.id.spinner2) as Spinner
        val list = ArrayList<String>()
        list.add("Male")
        list.add("Female")
    }
}
