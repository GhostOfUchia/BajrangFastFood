package com.example.bajrangfastfood.ui.menu

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.bajrangfastfood.databinding.MenuFragmentBinding

class MenuFragment : Fragment() {

    private lateinit var myViewModle: MenuViewModle
    private lateinit var menuAdapter: MenuAdapter

    private var _binding: MenuFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        myViewModle = ViewModelProvider(this)[MenuViewModle::class.java]
        _binding = MenuFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        myViewModle.getMenuItem()
        this.menuAdapter = MenuAdapter()
        binding.menu.adapter = menuAdapter
        binding.menu.layoutManager = LinearLayoutManager(context)

        myViewModle.item.observe(this.viewLifecycleOwner, Observer {
            menuAdapter.setMenuData(it as List<MenuItem>)
        })

        binding.callButton.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:" + "8930332423")
            startActivity(callIntent)
        }

        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}