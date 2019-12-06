package com.pita.calanderpractice

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = mainCalendar.setOnDateChangeListener{ view, year, month, dayOfMonth ->
            val ThirdPageIntent = Intent(this, ThirdPage::class.java)


            ThirdPageIntent.putExtra("day", dayOfMonth)
            ThirdPageIntent.putExtra("month", month+1)
            ThirdPageIntent.putExtra("year", year)
            startActivity(ThirdPageIntent)

            val fromThird = intent
            var fromThirdInputArray = intent.getIntArrayExtra("COLOR_LIST")

            Contents(year, month, dayOfMonth, fromThirdInputArray)
        }



    }


}
