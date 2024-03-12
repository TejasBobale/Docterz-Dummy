package com.example.dummyapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.net.URI

class Dashboard : AppCompatActivity() {
    lateinit var logo: ImageView
    lateinit var docter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

//        val btnBack = findViewById<Button>(R.id.back)
//
//        btnBack.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }

        logo = findViewById(R.id.appLogo)
        docter = findViewById(R.id.docterName)
        var received = intent

        docter.text = received.getStringExtra("docter_name")

        var imageUri = received.data
        if (imageUri != null){
            Glide
        }





    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if(requestCode == 1){
//            logo.setImageURI(data?.data)
//        }
//    }
}