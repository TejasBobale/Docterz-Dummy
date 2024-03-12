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
    //lateinit var logo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

//        val btnBack = findViewById<Button>(R.id.back)
//
//        btnBack.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }

//        var logo = findViewById<ImageView>(R.id.appLogo)
        var doctername = findViewById<TextView>(R.id.doctername)
        var docterprofession = findViewById<TextView>(R.id.docterprofession)
//        var docterdegree = findViewById<TextView>(R.id.docterdegree)
//
        var received = intent

        doctername.text = received.getStringExtra("docter_name") ?: "Doctor Name"
        docterprofession.text = received.getStringExtra("docter_profession") ?: "Doctor Profession"
//        docterdegree.text = received.getStringExtra("docter_degree") ?: "Doctor Degree"


//        received.data?.let { uri ->
//            logo.setImageURI(uri)
//        }
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if(requestCode == 1){
//            logo.setImageURI(data?.data)
//        }
//    }
}