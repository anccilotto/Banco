package com.example.banco

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SegundaTelaActivity : AppCompatActivity() {


    private  lateinit var btVoltar: ImageView

    private lateinit var btTelaDois: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda_tela)

        btVoltar = findViewById(R.id.btn_voltar)

        btTelaDois = findViewById(R.id.btn_Segunda_Tela)

        btTelaDois.setOnClickListener {
            val intent = Intent(this,TerceiraTelaActivity::class.java)

            startActivity(intent)
        }

        btVoltar.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }

    }
}