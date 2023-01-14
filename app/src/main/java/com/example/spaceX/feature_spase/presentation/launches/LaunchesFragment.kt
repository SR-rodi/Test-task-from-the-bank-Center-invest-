package com.example.spaceX.feature_spase.presentation.launches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import com.example.spaceX.core.basefragment.BaseFragment
import com.example.spaceX.core.extension.appComponent
import com.example.spaceX.feature_spase.presentation.launches.adapter.LaunchesAdapter
import com.example.spaceX.feature_spase.presentation.launches.adapter.LoadAdapter
import com.example.spaceX.databinding.FragmentLaunchesBinding
import kotlinx.coroutines.launch

class LaunchesFragment : BaseFragment<FragmentLaunchesBinding>() {

    private val viewModel: LaunchesViewModel by viewModels { requireContext().appComponent().viewModelFactory }

    override fun initBinding(inflater: LayoutInflater) = FragmentLaunchesBinding.inflate(inflater)

    private val launchAdapter by lazy { LaunchesAdapter { id -> navigate(id) } }
    private val loadAdapter by lazy { LoadAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.launchRecycler.adapter = launchAdapter.withLoadStateFooter(loadAdapter)
        dataObserve()
        loadStateObserve()
        refreshListener()
    }

    private fun refreshListener() {
        binding.refresh.setOnRefreshListener {
            launchAdapter.refresh()
        }
    }

    private fun dataObserve() =
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.data.collect { pagingData ->
                launchAdapter.submitData(pagingData)
            }
        }

    private fun loadStateObserve() {
        viewLifecycleOwner.lifecycleScope.launch {
            launchAdapter.loadStateFlow.collect { loadState ->
                binding.refresh.isRefreshing = loadState.refresh is LoadState.Loading
                binding.error.notInternet.isVisible =
                    (loadState.append is LoadState.Error || loadState.refresh is LoadState.Error)
            }
        }
    }

    private fun navigate(id: String) {
        findNavController().navigate(
            LaunchesFragmentDirections.actionLaunchesFragmentToDetailsFragment(id)
        )
    }
}