package com.example.htmlerning

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SingInActivityEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singin)

        val GoogleSignInButton = findViewById<View>(R.id.buttonGoogleSignIn) as Button // находим кнопку по id
        val buttonRegister = findViewById<View>(R.id.buttonViewMoreOptions) as Button
        val textViewLogin2 = findViewById<TextView>(R.id.textViewLogin2)
        textViewLogin2.setOnClickListener {
            // Здесь добавьте код для запуска активности SignUp
            val intent = Intent(this, SingUpActivityEmail::class.java)
            startActivity(intent)
        }
        GoogleSignInButton.setOnClickListener {
            val intent: Intent = Intent(
                this,
                SecondActivity::class.java
            ) // создаем Intent
            startActivity(intent) // начинаем новую активность
        }

        buttonRegister.setOnClickListener {
            val editTextEmail = findViewById<EditText>(R.id.editTextTextEmailAddress)
            val editTextPassword = findViewById<EditText>(R.id.editTextTextPassword)
            val email = editTextEmail.text.toString().trim()
            val password = editTextPassword.text.toString().trim()

            if (TextUtils.isEmpty(email)) {
                editTextEmail.error = "Введите email"
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(password)) {
                editTextPassword.error = "Введите пароль"
                return@setOnClickListener
            }
            if (password.length < 6) {
                editTextPassword.error = "Пароль должен содержать не менее 6 символов"
                return@setOnClickListener
            }


            // Если данные верны, можно выполнять регистрацию или другие действия
            // Например,можно вызвать метод для регистрации пользователя
            registerUser(email, password)

            val intent: Intent = Intent(
                this,
                GeneralActivity::class.java
            ) // создаем Intent для перехода на general
            startActivity(intent)

        }
    }

    // Метод для регистрации пользователя
    private fun registerUser(email: String,  password: String) {
        // Здесь вы можете написать код для регистрации пользователя
        // Например, можно использовать Firebase Authentication или другую систему регистрации
    }
}