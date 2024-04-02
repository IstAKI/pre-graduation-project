package com.example.htmlerning

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class GeneralActivity : AppCompatActivity() {
    private lateinit var questionTextView: TextView
    private lateinit var nextButton: Button

    private val questions = listOf(
        "HTML поддерживает встроенные стили?",
        "В HTML можно использовать JavaScript без каких-либо дополнительных библиотек?",
        "HTML позволяет создавать анимированные элементы без CSS или JavaScript?",
        "Можно в HTML использовать несколько тегов <body> на одной странице?",
        "HTML поддерживает вложенные формы?",
        "Можно ли использовать таблицы для создания макета страницы в HTML?",
        "В HTML можно создавать динамические списки без JavaScript?",
        "HTML позволяет создавать встроенные аудио и видео плееры без использования сторонних библиотек?",
        "Можно ли в HTML встроить файлы Adobe Photoshop без конвертации?",
        "HTML поддерживает прокручиваемые области на странице без использования JavaScript?",
        "В HTML можно создать интерактивные элементы без использования сценариев?",
        "Можно ли в HTML использовать гиперссылки для создания внутренних якорей на странице?",
        "HTML позволяет создавать раскрывающиеся списки без использования JavaScript?",
        "Можно ли в HTML использовать картинки в качестве фона для элементов?",
        "HTML позволяет создавать динамически меняющиеся цвета элементов без JavaScript?",
        "Можно ли в HTML создавать формы для загрузки файлов на сервер?",
        "HTML поддерживает вставку SVG-графики без дополнительных плагинов?",
        "В HTML можно создать полосу прокрутки для блока текста без использования JavaScript?",
        "Можно ли в HTML создать переходы между страницами без использования CSS?",
        "HTML позволяет встраивать виджеты социальных сетей без специальных библиотек?"
    )

    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)

        questionTextView = findViewById(R.id.questionTextView)
        nextButton = findViewById(R.id.nextButton)

        displayQuestion()

        nextButton.setOnClickListener {
            showNextQuestion()
            startFallingAnimation()
        }
    }

    private fun displayQuestion() {
        questionTextView.text = questions[currentQuestionIndex]
    }

    private fun showNextQuestion() {
        currentQuestionIndex = (currentQuestionIndex + 1) % questions.size
        displayQuestion()
    }

    private fun startFallingAnimation() {
        val animation = AnimationUtils.loadAnimation(this, R.anim.falling)
        findViewById<Button>(R.id.nextButton).startAnimation(animation)
    }


}