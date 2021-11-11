package com.thiago.perfil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.widget.AppCompatButton

class TelaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_tela_principal)

        val btnadote = findViewById<AppCompatButton>(R.id.btnadote)

        btnadote.setOnClickListener {
            val intent = Intent(this, Buttons::class.java)
            startActivity(intent)
        }
        val btndeslogar = findViewById<AppCompatButton>(R.id.btndeslogar)

        btndeslogar.setOnClickListener {
            val intent = Intent(this, formLogin::class.java)
            startActivity(intent)
        }
    }
}