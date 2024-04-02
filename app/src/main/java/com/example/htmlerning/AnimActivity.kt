package com.example.htmlerning

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.TranslateAnimation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AnimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val moneyGangImageView: ImageView = findViewById(R.id.imageViewMoneyGang)
            val webWizardImageView: ImageView = findViewById(R.id.imageViewWebWizard)
            val yourLogoImageView: ImageView  = findViewById(R.id.imageViewLogo)

            // Анимация увеличения размеров логотипа
            val fromScale = 0f
            val toScale = 1f // 1f означает нормальный размер

            val scaleAnimation = ScaleAnimation(fromScale, toScale, fromScale, toScale)
            scaleAnimation.duration = 500 // Продолжительность анимации в миллисекундах

            yourLogoImageView.startAnimation(scaleAnimation)

            // Выползание изображения MoneyGang относительно WebWizard
            val fromYDelta = 5000f
            val toYDelta = webWizardImageView.height.toFloat() // Вы можете настроить смещение, как вам нужно

            val translateAnimation = TranslateAnimation(0f, 0f, fromYDelta, toYDelta)
            translateAnimation.duration = 3000 // Продолжительность анимации в миллисекундах

            webWizardImageView.startAnimation(translateAnimation)
            moneyGangImageView.startAnimation(translateAnimation)

            Handler().postDelayed({
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                    finish()
            }, 5000)

    }
}
