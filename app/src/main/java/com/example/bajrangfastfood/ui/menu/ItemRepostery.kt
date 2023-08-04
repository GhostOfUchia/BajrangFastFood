package com.example.bajrangfastfood.ui.menu

import com.example.bajrangfastfood.R

class ItemRepostery {

    companion object {
        fun getItemList(): List<MenuItem> {
            return listOf(
                MenuItem("Simple Burger", R.drawable.burger_img, "20"),
                MenuItem("Chesse Burger", R.drawable.burger_img, "25"),
                MenuItem("Cream Burger", R.drawable.burger_img, "35"),
                MenuItem("Simple Chowmein", R.drawable.noodles_img, "50"),
                MenuItem("Manchurian Chowmein", R.drawable.noodles_img, "50"),
                MenuItem("SweetCorn Chowmein", R.drawable.noodles_img, "50"),
                MenuItem("Singapuri Chowmein", R.drawable.noodles_img, "50"),
                MenuItem("Garlic Chowmein", R.drawable.noodles_img, "50"),
                MenuItem("Paneer Chowmein", R.drawable.noodles_img, "50"),
                MenuItem("Mashroom Chowmein", R.drawable.burger_img, "50"),
                MenuItem("Hakka Chowmein", R.drawable.burger_img, "50"),
                MenuItem("Special Chowmein", R.drawable.burger_img, "50"),
                MenuItem("Veg Roll", R.drawable.roll_img, "50"),
                MenuItem("Cream Roll", R.drawable.roll_img, "50"),
                MenuItem("Tandoori Roll", R.drawable.roll_img, "50"),
                MenuItem("Tadka Roll", R.drawable.roll_img, "50"),
                MenuItem("Gravey Roll", R.drawable.roll_img, "50"),
                MenuItem("Panner Roll", R.drawable.roll_img, "50"),
                MenuItem("Cream Panner Roll", R.drawable.roll_img, "50"),
                MenuItem("Tandoori Panner Roll", R.drawable.roll_img, "50"),
                MenuItem("Tadka Panner Roll", R.drawable.roll_img, "50"),
                MenuItem("Finger Chipes", R.drawable.finger_img, "50"),
                MenuItem("Mashroom Finger", R.drawable.finger_img, "50"),
                MenuItem("Panner Finger", R.drawable.finger_img, "50")
            )

        }
    }
}

data class MenuItem(val itemName: String, val itemImageSrc: Int, val price: String)

