package com.thiago.perfil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.widget.AppCompatButton
import com.thiago.perfil.model.Pet_shop
import com.thiago.perfil.model.Veterinario


class Buttons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_buttons)


        val btncachorro = findViewById<AppCompatButton>(R.id.btncachorro)

        btncachorro.setOnClickListener {
            val intent = Intent (this, listasDeCachorro::class.java)
            startActivity(intent)
        }
        val btngato = findViewById<AppCompatButton>(R.id.btngato)

        btngato.setOnClickListener {
            val intent = Intent(this, ListaDeGato::class.java)
            startActivity(intent)
        }
        val btnpetshop = findViewById<AppCompatButton>(R.id.btnpetshop)

        btnpetshop.setOnClickListener {
            val intent = Intent(this, com.thiago.perfil.Pet_shop::class.java)
            startActivity(intent)
        }
        val btnveterinario = findViewById<AppCompatButton>(R.id.btnveterinario)

        btnveterinario.setOnClickListener {
            val intent = Intent(this, Veterianario_list::class.java)
            startActivity(intent)
        }
    }
}