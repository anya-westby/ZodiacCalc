package com.example.zodiaccalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createZodiac(view: View) {
        var zodiac = "" //String

        //views
        val image = findViewById<ImageView>(R.id.image)
        image.setImageResource(R.drawable.circle)
        val outputMessage = findViewById<TextView>(R.id.output)
        val month = findViewById<EditText>(R.id.monthBox)
        val monthVal = Integer.parseInt(month.text.toString())
        val dayVal = findViewById<EditText>(R.id.dayBox)
        val day = Integer.parseInt(dayVal.text.toString())


        if (monthVal == 1){
            if (day < 20) {
                zodiac = "Capricorn"
                image.setImageResource(R.drawable.capricorn)
            } else {
                zodiac = "Aquarius"
                image.setImageResource(R.drawable.aquarius)
            }
        } else if (monthVal == 2) {
            if (day < 20) {
                zodiac = "Aquarius"
                image.setImageResource(R.drawable.aquarius)
            } else {
                zodiac = "Pisces"
                image.setImageResource(R.drawable.pisces)
            }
        } else if (monthVal == 3) {
            if (day < 20) {
                zodiac = "Pisces"
                image.setImageResource(R.drawable.pisces)
            } else {
                zodiac = "Aries"
                image.setImageResource(R.drawable.aries)
            }
        } else if (monthVal == 4) {
            if (day < 20) {
                zodiac = "Aries"
                image.setImageResource(R.drawable.aries)
            } else {
                zodiac = "Taurus"
                image.setImageResource(R.drawable.taurus)
            }
        } else if (monthVal == 5) {
            if (day < 20) {
                zodiac = "Taurus"
                image.setImageResource(R.drawable.taurus)
            } else {
                zodiac = "Gemini"
                image.setImageResource(R.drawable.gemini)
            }
        } else if (monthVal == 6) {
            if (day < 20) {
                zodiac = "Gemini"
                image.setImageResource(R.drawable.gemini)
            } else {
                zodiac = "Cancer"
                image.setImageResource(R.drawable.cancer)
            }
        } else if (monthVal == 7) {
            if (day < 20) {
                zodiac = "Cancer"
                image.setImageResource(R.drawable.cancer)
            } else {
                zodiac = "Leo"
                image.setImageResource(R.drawable.leo)
            }
        } else if (monthVal == 8) {
            if (day < 20) {
                zodiac = "Leo"
                image.setImageResource(R.drawable.leo)
            } else {
                zodiac = "Virgo"
                image.setImageResource(R.drawable.virgo)
            }
        } else if (monthVal == 9) {
            if (day < 20) {
                zodiac = "Virgo"
                image.setImageResource(R.drawable.virgo)
            } else {
                zodiac = "Libra"
                image.setImageResource(R.drawable.libra)
            }
        } else if (monthVal == 10) {
            if (day < 20) {
                zodiac = "Libra"
                image.setImageResource(R.drawable.libra)
            } else {
                zodiac = "Scorpio"
                image.setImageResource(R.drawable.scorpio)
            }
        } else if (monthVal == 11) {
            if (day < 20) {
                zodiac = "Scorpio"
                image.setImageResource(R.drawable.scorpio)
            } else {
                zodiac = "Sagittarius"
                image.setImageResource(R.drawable.sagittarius)
            }
        } else if (monthVal == 12) {
            if (day < 20) {
                zodiac = "Sagittarius"
                image.setImageResource(R.drawable.sagittarius)
            } else {
                zodiac = "Capricorn"
                image.setImageResource(R.drawable.capricorn)
            }
        }


        //textview
        outputMessage.text = "Since your birthday is " +monthVal+ "/" +day+ ", your zodiac sign is " + zodiac

    }
}
