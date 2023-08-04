package com.example.bajrangfastfood.ui.menu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.bajrangfastfood.R

class MenuAdapter: RecyclerView.Adapter<MenuAdapter.MyViewHolder>() {

    var menu:List<MenuItem>? = null

    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
    val menuItem = itemView.findViewById<TextView>(R.id.item_name)
        val itemImag = itemView.findViewById<ImageView>(R.id.image_view)
        val itemPrice = itemView.findViewById<TextView>(R.id.item_price)
   fun bindView(menuitem: MenuItem){
       menuItem.text = menuitem.itemName
       itemImag.setImageResource(menuitem.itemImageSrc)
       itemPrice.text = menuitem.price
   }

    }

    fun setMenuData(menuitem: List<MenuItem>) {
        menu = menuitem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_card_view, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
      return menu!!.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
holder.bindView(menu!![position])
    }
}