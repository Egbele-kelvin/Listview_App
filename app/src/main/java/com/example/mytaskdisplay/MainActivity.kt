package com.example.mytaskdisplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener{
            val email = email_text.text.toString()
            val password = password_text.text.toString()

            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()){
                Toast.makeText(this,"Please Enter Email and Password", Toast.LENGTH_SHORT).show()
            } else {
                if (email.toString() == "kelvinegbelekro@zuri.com" && password.toString() == "123456"){
                    val intent = Intent(this, DashboardActvity::class.java)
                    startActivity(intent)
                    Toast.makeText(this,"Welcome Back Kelvin", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"Email not Recognized", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}