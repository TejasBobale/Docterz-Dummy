package com.example.dummyapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var btnCreate: Button
    lateinit var btnImagePicker: FloatingActionButton
    val storedImage = Intent()
    var uri: Intent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<EditText>(R.id.docterName)
        var profession = findViewById<EditText>(R.id.docterProfession)
        var degree = findViewById<EditText>(R.id.docterDegree)

        btnCreate = findViewById(R.id.create)
        btnImagePicker = findViewById(R.id.imagePicker)

        btnCreate.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java).also {
                it.putExtra("app_logo", uri)
                it.putExtra("docter_name",name.text.toString())
                it.putExtra("docter_profession",profession.text.toString())
                it.putExtra("docter_degree",degree.text.toString())

                startActivity(it)
            }
        }
        btnImagePicker.setOnClickListener{
            image = findViewById(R.id.image)
            uploadImage(image)
        }
    }

     fun uploadImage(image: ImageView?) {
        storedImage.action = Intent.ACTION_GET_CONTENT
        storedImage.type = "image/*"
         startActivityForResult(storedImage, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1 ){
            uri = data
            image.setImageURI(data?.data)
        }
    }
}