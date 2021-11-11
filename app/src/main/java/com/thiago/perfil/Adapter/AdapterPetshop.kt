package com.thiago.perfil.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thiago.perfil.R
import com.thiago.perfil.model.Pet_shop


class AdapterPetshop(private val context: Context, private val petshop:MutableList<Pet_shop>): RecyclerView.Adapter<AdapterPetshop.PetshopViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterPetshop.PetshopViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.petshop_list, parent, false)
        val holder = PetshopViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int = petshop.size


    override fun onBindViewHolder(holder: PetshopViewHolder, position: Int) {
        holder.foto.setImageResource(petshop[position].foto)
        holder.nome.text = petshop[position].nome
        holder.descricao.text = petshop[position].descricao
        holder.contato.text = petshop[position].contato

    }

    inner class PetshopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_petshop)
        val nome = itemView.findViewById<TextView>(R.id.nome_petshop)
        val descricao = itemView.findViewById<TextView>(R.id.descricao)
        val contato = itemView.findViewById<TextView>(R.id.contato)
    }
}


