package com.thiago.Adote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiago.Adote.Adapter.AdapterVeterinario
import com.thiago.Adote.model.Veterinario

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
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario)

        val veterinario2 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario2)


        val veterinario3 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario3)

        val veterinario4 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario4)

        val veterinario5 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario5)

        val veterinario6 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario6)

        val veterinario7 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario7)

        val veterinario8 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario8)

        val veterinario9 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario9)

        val veterinario10 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario10)

        val veterinario11 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario11)

        val veterinario12 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario12)

        val veterinario13 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario13)

        val veterinario14 = Veterinario(
            R.drawable.dogcat,
            "Veterinário",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDeVeterinario.add(veterinario14)
    }
}