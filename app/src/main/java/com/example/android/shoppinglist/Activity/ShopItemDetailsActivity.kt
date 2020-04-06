package com.example.android.shoppinglist.Activity

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.android.shoppinglist.R
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

class ShopItemDetailsActivity : AppCompatActivity() {

    lateinit var itemTitle : TextView
    lateinit var itemImageView : ImageView
    lateinit var itemPrice : TextView
    lateinit var itemDescription : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_item_details)

        itemTitle = findViewById(R.id.item_name)
        itemImageView = findViewById(R.id.itemImageView)
        itemPrice = findViewById(R.id.price)
        itemDescription = findViewById(R.id.item_description)


        var shopItemTitle : String = intent.getStringExtra("itemTitle")
        var shopItemImage : Int = intent.getIntExtra("itemImage",-1)
        var shopItemPrice : Double = intent.getDoubleExtra("itemAmount",0.0)
        var shopItemDescription : String = intent.getStringExtra("itemDescription")

        fun formatTheNumber(number: Double): String{
            val formatter : NumberFormat = DecimalFormat("#,###.##")
            var formattedNumber : String = formatter.format(number)
            return "€ ${formattedNumber}"

        }
        var priceString : String = formatTheNumber(shopItemPrice)
        //var priceString : String = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(shopItemPrice)

        itemTitle.text = shopItemTitle
        itemImageView.setImageResource(shopItemImage)
        itemDescription.text = shopItemDescription
        itemPrice.text = priceString

    }
}
