package com.example.spasex.feature_spase.presentation.details

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.spasex.core.BaseFragment
import com.example.spasex.core.appComponent
import com.example.spasex.databinding.FragmentDetailsBinding

class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {

    private val viewModel by viewModels<DetailsViewModel> { requireContext().appComponent().viewModelFactory }

    private val args by navArgs<DetailsFragmentArgs>()

    override fun initBinding(inflater: LayoutInflater)= FragmentDetailsBinding.inflate(inflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Kart",args.id)

        binding.testId.text = args.id

    }
}