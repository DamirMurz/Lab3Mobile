package com.example.lab3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent

class TipAdapter: RecyclerView.Adapter<TipHolder>() {
    val tipList = DataTip.tipList
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TipHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return TipHolder(view)
    }

    override fun onBindViewHolder(holder: TipHolder, position: Int) {
        holder.bind(tipList[position], position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ClickActivity::class.java)
            intent.putExtra("POSITION", position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return tipList.size
    }
}