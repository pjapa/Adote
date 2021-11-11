package com.thiago.perfil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiago.perfil.Adapter.AdapterVeterinario
import com.thiago.perfil.model.Veterinario

class Veterianario_list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_veterianario_list)

        val recyclerView_veterinario = findViewById<RecyclerView>(R.id.recyclerView_veterinario)
        recyclerView_veterinario.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_veterinario.setHasFixedSize(true)

        val listaDeVeterinario: MutableList<Veterinario> = mutableListOf()
        val adapterVeterinario = AdapterVeterinario(this, listaDeVeterinario)
        recyclerView_veterinario.adapter = adapterVeterinario

        val veterinario = Veterinario(
            R.drawable.vet,
            "Veterinário",
            "contato",
            "(11)9........."
        )
        listaDeVeterinario.add(veterinario)

        val veterinario2 = Veterinario(
            R.drawable.vet2,
            "Veterinário",
            "contato",
            "(11)9........."
        )
        listaDeVeterinario.add(veterinario2)


        val veterinario3 = Veterinario(
            R.drawable.vet3,
            "Veterinário",
            "contato",
            "(11)9........."
        )
        listaDeVeterinario.add(veterinario3)

        val veterinario4 = Veterinario(
            R.drawable.vet4,
            "Veterinário",
            "contato",
            "(11)9........."
        )
        listaDeVeterinario.add(veterinario4)

        val veterinario5 = Veterinario(
            R.drawable.vet5,
            "Veterinário",
            "contato",
            "(11)9........."
        )
        listaDeVeterinario.add(veterinario5)
    }
}