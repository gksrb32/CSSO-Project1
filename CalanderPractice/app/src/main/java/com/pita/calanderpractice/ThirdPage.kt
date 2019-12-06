package com.pita.calanderpractice


import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fourth_page.view.*
import kotlinx.android.synthetic.main.activity_third_page.*

class ThirdPage : AppCompatActivity() {

    val ColorList = intArrayOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)

        val fromMain = intent
        val thirdYear = intent.getIntExtra("year",2019)
        val thirdMonth = intent.getIntExtra("month",1)
        val thirdDay = intent.getIntExtra("day",15)

        ThirdDate.text = thirdMonth.toString() + "/" + thirdDay.toString() + "/" + thirdYear.toString()

        ThirdSaveBtn.setOnClickListener {

            val thirdText1 = ThirdText1.text.toString().toInt()

            ColorList[0] = thirdText1

            println(ColorList)

            val ToMainIntent = Intent(this, MainActivity::class.java)
            Toast.makeText(this, "Successfully Saved!", Toast.LENGTH_LONG).show()
            ToMainIntent.putExtra("COLOR_LIST", ColorList)

            startActivity(ToMainIntent)
        }
    }


}
