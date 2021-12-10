package com.example.exam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PriceListAdapter(private val pricesNames:List<String>):

    RecyclerView.Adapter<PriceListHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PriceListHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.price_list_item,parent,false)
        return PriceListHolder(itemView)
    }

    override fun onBindViewHolder(holder: PriceListHolder, position: Int) {
        val name=pricesNames[position]
        holder.bind((name))
    }

    override fun getItemCount(): Int {

        return pricesNames.size
    }
}