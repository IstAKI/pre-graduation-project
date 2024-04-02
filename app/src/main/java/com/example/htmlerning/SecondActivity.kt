package com.example.htmlerning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val yourButton = findViewById<View>(R.id.buttonViewMoreOptions) as Button // находим кнопку по id


        yourButton.setOnClickListener {
            val intent: Intent = Intent(
                this,
                SingInActivityEmail::class.java
            )
            startActivity(intent) // начинаем новую активность
        }
    }
}
