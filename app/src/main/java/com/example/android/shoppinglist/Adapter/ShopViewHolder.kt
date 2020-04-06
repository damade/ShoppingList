package com.example.android.shoppinglist.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.shoppinglist.Database.Shopping
import com.example.android.shoppinglist.R

class ShopViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_note_list, parent, false)) {
    private var mTitleView: TextView? = null
    private var mImageView: ImageView? = null


    init {
        mTitleView = itemView.findViewById(R.id.text_title)
        mImageView = itemView.findViewById(R.id.imageView)
    }

    fun bind(shop: Shopping, clickListener: OnItemClickListener) {
        mTitleView?.text = shop.title
        mImageView?.setImageResource(shop.image)
        itemView.setOnClickListener {
            clickListener.onItemClicked(shop)
        }
    }

}
interface OnItemClickListener{
    fun onItemClicked(shop: Shopping)
}