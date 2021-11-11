package com.thiago.perfil.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thiago.perfil.R
import com.thiago.perfil.model.Gato


class AdapterGato(private val context: Context, private val gato:MutableList<Gato>): RecyclerView.Adapter<AdapterGato.GatoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GatoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.cat_list, parent, false)
        val holder = GatoViewHolder(itemLista)
        return holder
    }


    override fun getItemCount(): Int = gato.size



    override fun onBindViewHolder(holder: GatoViewHolder, position: Int) {
        holder.foto.setImageResource(gato[position].foto)
        holder.nome.text = gato[position].nome
        holder.descricao.text = gato[position].descricao
        holder.contato.text = gato[position].contato

    }
    inner class GatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_gato)
        val nome = itemView.findViewById<TextView>(R.id.nome_gato)
        val descricao = itemView.findViewById<TextView>(R.id.descricao)
        val contato = itemView.findViewById<TextView>(R.id.contato)

    }


}