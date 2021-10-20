package com.example.doadzikirapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailArtikelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_detail_artikel)

        val dataTitle = intent.getStringExtra("title")
        val dataDesc = intent.getStringExtra("desc")
        val dataImg = intent.getIntExtra("image", 0)


        val tvTitle = findViewById<TextView>(R.id.tv_title_detail_artikel)
        tvTitle.text = dataTitle
        val tvDesc = findViewById<TextView>(R.id.tv_desc_detail_artikel)
        tvDesc.text = dataDesc
        val imgArtikel = findViewById<ImageView>(R.id.img_artikel)
        imgArtikel.setImageResource(dataImg)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}