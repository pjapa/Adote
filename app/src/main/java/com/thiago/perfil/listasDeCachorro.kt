package com.thiago.perfil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiago.perfil.Adapter.AdapterCachorro
import com.thiago.perfil.model.Cachorro

class listasDeCachorro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_listas_de_cachorro)

        val recyclerView_cachorro = findViewById<RecyclerView>(R.id.recyclerView_cachorro)
        recyclerView_cachorro.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_cachorro.setHasFixedSize(true)

        val listasDeCachorro: MutableList<Cachorro> = mutableListOf()
        val adapterCachorro = AdapterCachorro(this, listasDeCachorro)
        recyclerView_cachorro.adapter = adapterCachorro

        val cachorro = Cachorro(
            R.drawable.cachorro,
            "cachorro",
            "contato",
            "(11)9........."
        )
        listasDeCachorro.add(cachorro)

        val cachorro2 = Cachorro(
            R.drawable.cachorro_2,
            "cachorro",
            "contato",
            "(11)9........."
        )
        listasDeCachorro.add(cachorro2)

        val cachorro3 = Cachorro(
            R.drawable.cachorro_3,
            "cachorro",
            "contato",
            "(11)9........."
        )
        listasDeCachorro.add(cachorro3)

        val cachorro4 = Cachorro(
            R.drawable.cachorro_4,
            "cachorro",
            "contato",
            "(11)9........."
        )
        listasDeCachorro.add(cachorro4)

        val cachorro5 = Cachorro(
            R.drawable.cachorro_5,
            "cachorro",
            "contato",
            "(11)9........."
        )
        listasDeCachorro.add(cachorro5)

        val cachorro6 = Cachorro(
            R.drawable.cachorro_6,
            "cachorro",
            "contato",
            "(11)9........."
        )
        listasDeCachorro.add(cachorro6)




    }
}