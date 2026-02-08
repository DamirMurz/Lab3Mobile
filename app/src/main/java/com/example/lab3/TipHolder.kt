package com.example.lab3

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipHolder(item: View): RecyclerView.ViewHolder(item) {
    val dayG = item.findViewById<TextView>(R.id.day)
    val nameG = item.findViewById<TextView>(R.id.name)
    val imageG = item.findViewById<ImageView>(R.id.poster)
    val descG = item.findViewById<TextView>(R.id.desc)
    fun bind(tip: Tip, position: Int){
        dayG.setText(itemView.context.getString(R.string.day_prefix, position+1))

        nameG.setText(tip.nameId)
        imageG.setImageResource(tip.imageId)
        descG.setText(tip.desctiptionId)
    }
}