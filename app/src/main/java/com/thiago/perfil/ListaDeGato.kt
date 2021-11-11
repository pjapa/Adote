package com.thiago.perfil

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiago.perfil.Adapter.AdapterCachorro
import com.thiago.perfil.Adapter.AdapterGato
import com.thiago.perfil.model.Cachorro
import com.thiago.perfil.model.Gato

class ListaDeGato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_lista_de_gato)

        val recyclerView_gato = findViewById<RecyclerView>(R.id.recyclerView_gato)
        recyclerView_gato.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_gato.setHasFixedSize(true)

        val listaDeGato: MutableList<Gato> = mutableListOf()
        val adapterGato = AdapterGato(this, listaDeGato)
        recyclerView_gato.adapter = adapterGato

        val gato =Gato(
            R.drawable.gato,
            "gato",
            "contato",
            "(11)9........."
        )
        listaDeGato.add(gato)

        val gato2 = Gato(
            R.drawable.gato_2,
            "gato",
            "contato",
            "(11)9........."
        )
        listaDeGato.add(gato2)

        val gato3 = Gato(
            R.drawable.gato_3,
            "gato",
            "contato",
            "(11)9........."
        )
        listaDeGato.add(gato3)

        val gato4 =Gato(
            R.drawable.gato_4,
            "gato",
            "contato",
            "(11)9........."
        )
        listaDeGato.add(gato4)

        val gato5 = Gato(
            R.drawable.gato_5,
            "gato",
            "contato",
            "(11)9........."
        )
        listaDeGato.add(gato5)

        val gato6 = Gato(
            R.drawable.gat_6,
            "gato",
            "contato",
            "(11)9........."
        )
        listaDeGato.add(gato6)

        val gato7 = Gato(
            R.drawable.gato_7,
            "gato",
            "contato",
            "(11)9........."
        )
        listaDeGato.add(gato7)

        val gato8 = Gato(
            R.drawable.gato_8,
            "gato",
            "contato",
            "(11)9........."
        )
        listaDeGato.add(gato8)




    }
}