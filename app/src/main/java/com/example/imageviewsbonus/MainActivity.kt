package com.example.imageviewsbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var iv:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        iv = findViewById(R.id.imageView)
        btn1.setOnClickListener {
            iv.setBackgroundResource(R.drawable.img1)
        }
        btn2.setOnClickListener {  iv.setBackgroundResource(R.drawable.img2) }
    }
}