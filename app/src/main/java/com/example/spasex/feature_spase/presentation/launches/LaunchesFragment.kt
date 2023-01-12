package com.example.spasex.feature_spase.presentation.launches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.spasex.R
import com.example.spasex.core.BaseFragment
import com.example.spasex.core.appComponent
import com.example.spasex.databinding.FragmentLaunchesBinding
import com.example.spasex.feature_spase.presentation.launches.adapter.LaunchesAdapter
import kotlinx.coroutines.launch

class LaunchesFragment : BaseFragment<FragmentLaunchesBinding>() {

   private val viewModel:LaunchesViewModel by viewModels { requireContext().appComponent().viewModelFactory }

   override fun initBinding(inflater: LayoutInflater)= FragmentLaunchesBinding.inflate(inflater)

   private val adapter by lazy { LaunchesAdapter{id-> navigate(id)  } }

   private fun navigate(id:String) {
      findNavController().navigate(LaunchesFragmentDirections.actionLaunchesFragmentToDetailsFragment(id))
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)

      binding.launchRecycler.adapter =adapter

      viewLifecycleOwner.lifecycleScope.launch {
         viewModel.data.collect{ pagingData->
            adapter.submitData(pagingData)
         }
      }
   }


}