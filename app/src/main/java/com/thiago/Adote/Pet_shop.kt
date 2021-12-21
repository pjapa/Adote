package com.thiago.Adote

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiago.Adote.Adapter.AdapterPetshop
import com.thiago.Adote.model.Pet_shop

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
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop)

        val petShop2 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop2)

        val petShop3 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop3)

        val petShop4 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop4)
        val petShop5 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop5)
        val petShop6 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop6)
        val petShop7 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop7)
        val petShop8 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop8)
        val petShop15 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop15)
        val petShop9 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop9)
        val petShop10 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop10)
        val petShop11 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop11)
        val petShop12 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop12)
        val petShop13 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop13)
        val petShop14 = Pet_shop(
            R.drawable.dogcat,
            "Pet Shop",
            "anuncie aqui",
            "(11)97832-9155"
        )
        listaDePet_shop.add(petShop14)






    }
}