package com.example.banco

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {

    private lateinit var btProximaTela: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btProximaTela = findViewById(R.id.btn_primeira_tela)

        btProximaTela.setOnClickListener{

            val intente = Intent(this,SegundaTelaActivity::class.java)

            startActivity(intente)

        }




    }
}