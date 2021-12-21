package com.thiago.Adote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiago.Adote.Adapter.AdapterCachorro
import com.thiago.Adote.model.Cachorro

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
            R.drawable.thor,
            "Ruy",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro)

        val cachorro2 = Cachorro(
            R.drawable.tho,
            "Thor",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro2)

        val cachorro3 = Cachorro(
            R.drawable.bethoven,
            "Bethoven",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro3)

        val cachorro4 = Cachorro(
            R.drawable.estrela,
            "Estrela",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    "  Fêmea",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro4)

        val cachorro5 = Cachorro(
            R.drawable.dobi,
            "Dobby",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro5)

        val cachorro6 = Cachorro(
            R.drawable.kaique,
            "Kaique",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro6)

        val cachorro7 = Cachorro(
            R.drawable.jubileu,
            "Jubileu",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro7)

        val cachorro8 = Cachorro(
            R.drawable.juqui,
            "Juqui",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro8)
        val cachorro9 = Cachorro(
            R.drawable.luck,
            "Luck",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro9)
        val cachorro10 = Cachorro(
            R.drawable.nhoque,
            "Nhoque",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro10)
        val cachorro11 = Cachorro(
            R.drawable.pirata,
            "Pirata",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro11)
        val cachorro12 = Cachorro(
            R.drawable.zecagrande,
            "Zeca",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro12)
        val cachorro13 = Cachorro(
            R.drawable.sheikgarande,
            "Sheik",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro13)
        val cachorro14 = Cachorro(
            R.drawable.raulgilmedio,
            "Raul Gil",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro14)
        val cachorro15 = Cachorro(
            R.drawable.tucamedio,
            "Tuca",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro15)
        val cachorro16 = Cachorro(
            R.drawable.vigulinogrande,
            "Kaique",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro16)
        val cachorro17 = Cachorro(
            R.drawable.jubileiafemeamedio,
            "Jubileia",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " Fêmea",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro17)
        val cachorro18 = Cachorro(
            R.drawable.jadefemeamedio,
            "Jade",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    " Fêmea",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro18)
        val cachorro19 = Cachorro(
            R.drawable.luafemeagrande,
            "Lua",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " Fêmea",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro19)
        val cachorro20 = Cachorro(
            R.drawable.ramirogrande,
            "Ramiro",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro20)
        val cachorro21 = Cachorro(
            R.drawable.coronelgrande,
            "Coronel",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro21)
        val cachorro22 = Cachorro(
            R.drawable.brutusgrande,
            "Brutus",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro22)
        val cachorro23 = Cachorro(
            R.drawable.jaygrande,
            "Jay",
            "Porte Grande," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro23)
        val cachorro24 = Cachorro(
            R.drawable.jadefemeamedio,
            "Jade",
            "Porte Médio," +
                    " castrado," +
                    " vacinado," +
                    "  Fêmea",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro24)
        val cachorro25 = Cachorro(
            R.drawable.jucapeq,
            "Juca",
            "Porte Pequeno," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro25)
        val cachorro26 = Cachorro(
            R.drawable.toddypeq,
            "Toddy",
            "Porte Pequeno," +
                    " castrado," +
                    " vacinado," +
                    " macho",
            "(11)43653349/" +
                    " 43689237"
        )
        listasDeCachorro.add(cachorro26)




    }
}