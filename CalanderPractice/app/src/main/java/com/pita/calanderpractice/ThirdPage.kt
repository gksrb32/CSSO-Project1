package com.pita.calanderpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ThirdPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)

        var iv1: ImageView = findViewById(R.id.imageView)
        var iv2: ImageView = findViewById(R.id.imageView2)
    }

    private class ChoiceTouchListener
}
