package com.example.doadzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QauliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvQauliyahShalat = findViewById<RecyclerView>(R.id.rv_qauliyah_shalat)
        rvQauliyahShalat.layoutManager = LinearLayoutManager(this)
        rvQauliyahShalat.adapter = DzikirAdapter(DataDzikirDoa.listQauliyah)

        val rvDzikir = findViewById<RecyclerView>(R.id.rv_setiap_saat_dzikir)
        rvDzikir.layoutManager = LinearLayoutManager(this)
        rvDzikir.adapter = DzikirAdapter(DataDzikirDoa.listDzikir)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}