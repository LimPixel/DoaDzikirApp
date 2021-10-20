package com.example.doadzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HarianDzikirDoaActivity : AppCompatActivity() {


    //Data kosong
    private val listHarianDzikir: ArrayList<DzikirDoa> = arrayListOf()


    // Data disiapkan


    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harian_dzikir_doa)

        initData()
        initView()

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun initView() {
        val rvHarianDzikirDoa: RecyclerView = findViewById(R.id.rv_harian_dzikir_doa)
        rvHarianDzikirDoa.layoutManager = LinearLayoutManager(this)
        rvHarianDzikirDoa.adapter = DzikirAdapter(listHarianDzikir)

    }

    private fun initData() {
        val descHarianDzikirDoa = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafazHarianDzikirDoa = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemahHarianDzikirDoa = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in descHarianDzikirDoa.indices){
            val  list = DzikirDoa(
                descHarianDzikirDoa[data],
                lafazHarianDzikirDoa[data],
                terjemahHarianDzikirDoa[data]
            )
            listHarianDzikir.add(list)
        }
    }
}