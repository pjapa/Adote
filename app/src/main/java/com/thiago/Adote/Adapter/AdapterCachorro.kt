package com.thiago.Adote.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thiago.Adote.R
import com.thiago.Adote.model.Cachorro

class AdapterCachorro(private val context: Context, private val cachorro:MutableList<Cachorro>): RecyclerView.Adapter<AdapterCachorro.CachorroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CachorroViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.dog_list, parent, false)
        val holder = CachorroViewHolder(itemLista)
        return holder
    }
    override fun getItemCount(): Int = cachorro.size
    override fun onBindViewHolder(holder: CachorroViewHolder, position: Int) {
        holder.foto.setImageResource(cachorro[position].foto)
        holder.nome.text = cachorro[position].nome
        holder.descricao.text = cachorro[position].descricao
        holder.contato.text = cachorro[position].contato
    }
    inner class CachorroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_cachorro)
        val nome = itemView.findViewById<TextView>(R.id.nome_cachorro)
        val descricao = itemView.findViewById<TextView>(R.id.descricao)
        val contato = itemView.findViewById<TextView>(R.id.contato)
    }
}