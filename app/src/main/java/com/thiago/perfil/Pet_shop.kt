package com.thiago.perfil

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiago.perfil.Adapter.AdapterPetshop
import com.thiago.perfil.model.Pet_shop

class Pet_shop: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_pet_shop)

        val recyclerView_petshop = findViewById<RecyclerView>(R.id.recyclerView_petshop)
        recyclerView_petshop.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_petshop.setHasFixedSize(true)

        val listaDePet_shop: MutableList<Pet_shop> = mutableListOf()
        val adapterPetshop = AdapterPetshop(this, listaDePet_shop)
        recyclerView_petshop.adapter = adapterPetshop

        val petShop = Pet_shop(
            R.drawable.pet,
            "Pet Shop",
            "contato",
            "(11)9........."
        )
        listaDePet_shop.add(petShop)

        val petShop2 = Pet_shop(
            R.drawable.pet2,
            "Pet Shop",
            "contato",
            "(11)9........."
        )
        listaDePet_shop.add(petShop2)

        val petShop3 = Pet_shop(
            R.drawable.pet3,
            "Pet Shop",
            "contato",
            "(11)9........."
        )
        listaDePet_shop.add(petShop3)

        val petShop4 = Pet_shop(
            R.drawable.pet4,
            "Pet Shop",
            "contato",
            "(11)9........."
        )
        listaDePet_shop.add(petShop4)






    }
}