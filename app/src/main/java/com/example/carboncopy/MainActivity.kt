package com.example.carboncopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Initial values for all players
    private var p1Score = 40
    private var p2Score = 40
    private var p3Score = 40
    private var p4Score = 40
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // player one (Blue) control for adding
        p1add.setOnClickListener {
            p1Score++
            player1.text = p1Score.toString()
        }

        // player one (Blue) control for subtracting
        p1sub.setOnClickListener {
            p1Score--
            player1.text = p1Score.toString()
        }

        // player two (White) control for adding
        p2add.setOnClickListener {
            p2Score++
            player2.text = p2Score.toString()
        }

        // player two (White) control for subtracting
        p2sub.setOnClickListener {
            p2Score--
            player2.text = p2Score.toString()
        }

        // player three (Green) control for adding
        p3add.setOnClickListener {
            p3Score++
            player3.text = p3Score.toString()
        }

        // player three (Green) control for subtracting
        p3sub.setOnClickListener {
            p3Score--
            player3.text = p3Score.toString()
        }

        // player four (Pink) control for adding
        p4add.setOnClickListener {
            p4Score++
            player4.text = p4Score.toString()
        }

        // player four (Pink) control for subtracting
        p4sub.setOnClickListener {
            p4Score--
            player4.text = p4Score.toString()
        }

        // resetting all players to initial value (40)
        reset.setOnClickListener {
            p1Score = 40
            p2Score = 40
            p3Score = 40
            p4Score = 40
            player1.text = p1Score.toString()
            player2.text = p2Score.toString()
            player3.text = p3Score.toString()
            player4.text = p4Score.toString()
        }

    }
}