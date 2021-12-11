package com.thiago.Adote.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thiago.Adote.R
import com.thiago.Adote.model.Veterinario

class AdapterVeterinario(private val context: Context, private val veterinario:MutableList<Veterinario>): RecyclerView.Adapter<AdapterVeterinario.VeterinarioViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterVeterinario.VeterinarioViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.veterinario_list, parent, false)
        val holder = VeterinarioViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int = veterinario.size


    override fun onBindViewHolder(holder: VeterinarioViewHolder, position: Int) {
        holder.foto.setImageResource(veterinario[position].foto)
        holder.nome.text = veterinario[position].nome
        holder.descricao.text = veterinario[position].descricao
        holder.contato.text = veterinario[position].contato

    }

    inner class VeterinarioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_veterinario)
        val nome = itemView.findViewById<TextView>(R.id.nome_veterinario)
        val descricao = itemView.findViewById<TextView>(R.id.descricao)
        val contato = itemView.findViewById<TextView>(R.id.contato)
    }
}