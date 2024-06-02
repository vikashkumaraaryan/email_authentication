package com.example.email_authentication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

     lateinit var email:EditText
     lateinit var password:EditText
     lateinit var confirmPassword:EditText
     lateinit var submit:Button

    @SuppressLint("MissingInflatedId" , "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v , insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left , systemBars.top , systemBars.right , systemBars.bottom)
            insets
        }

        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
        confirmPassword=findViewById(R.id.confirm_password)
        submit=findViewById(R.id.confirm_password)


    }
}