package com.example.doadzikirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class PagiPetangDzikirActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var cvDzikirPagi : CardView
    private lateinit var cvDzikirPetang : CardView
    private lateinit var btnDzikirPagi : ImageButton
    private lateinit var btnDzikirPetang : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_pagi_petang_dzikir2)

        cvDzikirPagi =  findViewById(R.id.cv_dzikir_pagi)
        cvDzikirPagi.setOnClickListener(this)
        cvDzikirPetang =  findViewById(R.id.cv_dzikir_petang)
        cvDzikirPetang.setOnClickListener(this)
        btnDzikirPagi =  findViewById(R.id.img_btn_dzikir_pagi)
        btnDzikirPagi.setOnClickListener(this)
        btnDzikirPetang = findViewById(R.id.img_btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener(this)



    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(view: View?) {
        when (view?.id){
            //Text Viewnya
            R.id.cv_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))
            R.id.cv_dzikir_petang -> startActivity(Intent(this, DzikirPagiActivity::class.java))

            //Img button
            R.id.img_btn_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))
            R.id.img_btn_dzikir_petang -> startActivity(Intent(this, DzikirPagiActivity::class.java))

        }
    }
}