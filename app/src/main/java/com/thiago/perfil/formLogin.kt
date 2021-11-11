package com.thiago.perfil

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.FirebaseAnalyticsKtxRegistrar
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class formLogin : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_form_login)





        val btnCadastro = findViewById<AppCompatButton>(R.id.btnCadastro)
        btnCadastro.setOnClickListener {
            val intent = Intent (this, FormCadastro::class.java)
            startActivity(intent)


        }

        val btnEntrar = findViewById<AppCompatButton>(R.id.btnEntrar)
        btnEntrar.setOnClickListener {
            val intent = Intent (this, Buttons::class.java)
            startActivity(intent)
        }



        }

    }





