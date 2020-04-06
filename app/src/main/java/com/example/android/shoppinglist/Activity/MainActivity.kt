package com.example.android.shoppinglist.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.shoppinglist.Adapter.OnItemClickListener
import com.example.android.shoppinglist.Adapter.ShoppingAdapter
import com.example.android.shoppinglist.Database.Shopping
import com.example.android.shoppinglist.Database.ShoppingData
import com.example.android.shoppinglist.R

class MainActivity : AppCompatActivity(), OnItemClickListener {
    private lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var shoppingRecyclerView: RecyclerView

    /*private val mShoppingList = listOf(
        Shopping("Raising Arizona", R.drawable.baseline_local_pizza_black_24)

    )*/
    override fun onItemClicked(shop: Shopping) {
        val intent = Intent(this, ShopItemDetailsActivity::class.java)
        intent.putExtra("itemTitle",shop.title)
        intent.putExtra("itemAmount",shop.amount)
        intent.putExtra("itemDescription",shop.description)
        intent.putExtra("itemImage",shop.image)
        startActivity(intent)
        Toast.makeText(this,"Shopping Item:  ${shop.title} \n ",Toast.LENGTH_SHORT).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
    }
    private fun setupRecyclerView() {
        shoppingRecyclerView = findViewById(R.id.recycler_view)
        shoppingRecyclerView.layoutManager = LinearLayoutManager(this)
        shoppingRecyclerView.adapter = ShoppingAdapter(ShoppingData().allData(),this)
    }


}


