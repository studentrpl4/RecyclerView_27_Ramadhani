package com.example.recyclerview_27_ramadhani

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ManhwaAdapter(private val context : Context, private val manhwa: List<Manhwa>, val listener: (Manhwa) -> Unit)
    : RecyclerView.Adapter<ManhwaAdapter.ManhwaViewHolder>(){

    class ManhwaViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgManhwa = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameManhwa = view.findViewById<TextView>(R.id.tv_item_name)
        val descManhwa = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(manhwa: Manhwa, listener: (Manhwa) -> Unit){
            imgManhwa.setImageResource(manhwa.imgManhwa)
            nameManhwa.text = manhwa.nameManhwa
            descManhwa.text = manhwa.descManhwa
            itemView.setOnClickListener {
                listener(manhwa)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManhwaViewHolder {
        return ManhwaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_manhwa, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ManhwaViewHolder, position: Int) {
        holder.bindView(manhwa[position], listener)
    }

    override fun getItemCount(): Int = manhwa.size
}
