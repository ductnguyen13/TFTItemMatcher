package com.bignerdranch.android.tftitemmatcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var item1_button:
            Button
    private lateinit var item2_button:
            Button
    private lateinit var combine_button:
            Button
    private lateinit var image1_view:
            ImageView
    private lateinit var image2_view:
            ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        item1_button = findViewById(R.id.item_one)
        item2_button = findViewById(R.id.item_two)
        combine_button = findViewById(R.id.combine)
        image1_view = findViewById(R.id.image_one)
        image2_view = findViewById(R.id.image_two)

        item1_button.setOnClickListener() {
            val intent = Intent(this, ItemSelector::class.java)
            startActivity(intent)
        }

        item2_button.setOnClickListener() {
            val intent = Intent(this, ItemSelector::class.java)
            startActivity(intent)
        }

        combine_button.setOnClickListener() {

        }

        image1_view.setOnClickListener() {
            val intent = Intent(this, ItemSelector::class.java)
            startActivity(intent)
        }
    }
}