package com.example.exam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerFragment : Fragment() {


lateinit var priceListRecyclerView:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_recycler, container, false)

val pricesNames:List<String> =listOf("Qween-45$","King-55$","Baby-66$","Prince-36$")

        priceListRecyclerView=view.findViewById(R.id.Price_list_recycler_view)
        priceListRecyclerView.layoutManager=
            LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        priceListRecyclerView.adapter=PriceListAdapter(pricesNames)

    return view

    }


}