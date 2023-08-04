package com.example.bajrangfastfood.ui.menu

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.SurfaceControlViewHost
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModle : ViewModel() {

    var itemList: List<MenuItem>? = null
    val item: MutableLiveData<List<MenuItem>> = MutableLiveData()

    fun getMenuItem() {
        itemList = ItemRepostery.getItemList()
        item.value = itemList
    }


}
