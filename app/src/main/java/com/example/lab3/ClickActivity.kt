package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
class ClickActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.click_layout)

        val position = intent.getIntExtra("POSITION", 0)

        val tip = DataTip.tipList[position]

        findViewById<ImageView>(R.id.image1).setImageResource(tip.imageId)
        findViewById<ImageView>(R.id.image2).setImageResource(tip.image1Id)
        findViewById<ImageView>(R.id.image3).setImageResource(tip.image2Id)
        findViewById<TextView>(R.id.textName).setText(tip.nameId)
        findViewById<TextView>(R.id.textDesc).setText(tip.longDescId)
    }
}