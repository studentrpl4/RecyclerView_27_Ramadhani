package com.example.recyclerview_27_ramadhani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailManhwaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_manhwa)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val manhwa = intent.getParcelableExtra<Manhwa>(MainActivity.INTENT_PARCALABLE)
        val imgmanhwa = findViewById<ImageView>(R.id.img_item_photo)
        val namemanhwa = findViewById<TextView>(R.id.tv_item_name)
        val descmanhwa = findViewById<TextView>(R.id.tv_item_description)

        imgmanhwa.setImageResource(manhwa?.imgManhwa!!)
        namemanhwa.text = manhwa.nameManhwa
        descmanhwa.text = manhwa.descManhwa
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}