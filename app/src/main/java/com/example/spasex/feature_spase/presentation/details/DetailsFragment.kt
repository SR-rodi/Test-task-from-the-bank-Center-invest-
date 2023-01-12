package com.example.spasex.feature_spase.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.spasex.core.appComponent

class DetailsFragment : Fragment() {

    val viewModel by viewModels<DetailsViewModel> { requireContext().appComponent().viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}