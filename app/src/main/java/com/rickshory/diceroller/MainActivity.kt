package com.rickshory.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
//        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
//            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText = findViewById<TextView>(R.id.result_text)
        val randomInt =  Random.nextInt(6) + 1
        resultText.text = "R O L L E D  $randomInt"
        val diceImage = findViewById<ImageView>(R.id.dice_image)
        
    }
}
