package com.example.android.shoppinglist.Database

import com.example.android.shoppinglist.R

class ShoppingData {
    fun allData(): List<Shopping> {
        val mShoppingList = listOf<Shopping>(
            Shopping(
                "Pizza", 5.5,
                "It is basically an individual medium pizza",
                R.drawable.baseline_local_pizza_black_36
            ),
            Shopping(
                    "Burger", 4.0,
            "It is basically an affordable drink and burger",
            R.drawable.baseline_fastfood_black_36
        ),
            Shopping(
                "Vintendo", 54.99 ,
                "It is basically an affordable video game under the Franchise Vintendo " +
                        "which can be acquired at about 54.99 Euros and redeemable at about 3 Euros" +
                        "(300 Gold points digital) and 0.60 Euros(60 Gold points digital) ",
                R.drawable.baseline_videogame_asset_black_36
            ),
            Shopping(
                "Vinux Smart Watch", 324.99,
                "It is a Vinux Galaxy Smart Watch that has touch screen abilities, " +
                        "760MB of RAM, 4G LTE, Tizen OS v3.0 and 4GB inbuilt memory for data " +
                        "and multimedia storage",
                R.drawable.baseline_watch_black_36
            ),
            Shopping(
                "Vinux S10", 900.0,
                "It is a Vinux Andoid phone of family Vinux S10 " +
                        "It has 8GB of RAM, 4G LTE and 5G in some locations, Tizen OS v8.0(Tizen O), " +
                        "256GB of inbuilt memory for data and multimedia storage." +
                        "It also has 3,100-mAh battery.",
                R.drawable.baseline_phone_android_black_36
            ),
            Shopping(
                "VinBook Pro", 1499.0,
                "It is a Vinux Laptop of family Vinux Computers " +
                        "It has 8GB of RAM, Core i7 processor(8th generation) with 2.4-GHz, Vin OS v11" +
                        "256GB SSD, USB-C Hub and 2560 x 1600-pixel Retina Display",
                R.drawable.baseline_computer_black_36
            ),
            Shopping(
                "Vinux TV", 1299.0,
                "It is a flat scren tv(LCD)",
                R.drawable.baseline_tv_black_36
            )

        )
        mShoppingList.sortedBy { it.title }
        return mShoppingList
    }
}