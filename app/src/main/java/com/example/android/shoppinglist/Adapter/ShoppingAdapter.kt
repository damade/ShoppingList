package com.example.android.shoppinglist.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.shoppinglist.Database.Shopping

class ShoppingAdapter(private val list: List<Shopping>,private val itemClickListener: OnItemClickListener): RecyclerView.Adapter<ShopViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ShopViewHolder(
            inflater,
            parent
        )
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        val shop: Shopping = list[position]
        holder.bind(shop,itemClickListener)
    }



}