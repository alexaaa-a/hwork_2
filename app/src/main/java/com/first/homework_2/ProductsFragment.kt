package com.first.homework_2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.first.homework_2.databinding.FragmentProductsBinding

class ProductsFragment : Fragment(R.layout.fragment_products) {

    private var binding: FragmentProductsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProductsBinding.bind(view)

        binding?.apply {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}