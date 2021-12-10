package com.example.exam

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PriceListHolder (itemView:View):RecyclerView.ViewHolder(itemView){


    private val priceListNameTextView:TextView=itemView.findViewById(R.id.price_list_name_text_view)

    fun bind(name:String){
        priceListNameTextView.text=name
    }
}