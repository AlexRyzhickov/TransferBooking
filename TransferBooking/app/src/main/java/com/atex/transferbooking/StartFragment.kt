package com.atex.transferbooking

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.start_fragment.*


class StartFragment : Fragment(R.layout.start_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button2.setOnClickListener {
            val action = StartFragmentDirections.actionStartFragmentToTransferFragment()
            findNavController().navigate(action)
        }
    }
}