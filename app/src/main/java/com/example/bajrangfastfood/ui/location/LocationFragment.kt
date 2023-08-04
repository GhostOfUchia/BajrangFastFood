package com.example.bajrangfastfood.ui.location

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bajrangfastfood.databinding.LocationFragmentBinding

class LocationFragment : Fragment() {

    private var _binding: LocationFragmentBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = LocationFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.locationBtn.setOnClickListener {

            val gmmIntentUri = Uri.parse("geo:29.770119,76.564253?z=10&q=JaiBajrangFoodPoint")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
          //
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}