package com.example.spaceX.feature_spase.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.example.spaceX.core.basefragment.BaseFragment
import com.example.spaceX.core.appComponent
import com.example.spaceX.core.loadingImage
import com.example.spaceX.core.setDateFormat
import com.example.spaceX.core.state.LoadState
import com.example.spaceX.feature_spase.presentation.details.adapter.CrewAdapter
import com.example.spaceX.R
import com.example.spaceX.databinding.FragmentDetailsBinding

import kotlinx.coroutines.launch

class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {

    private val viewModel by viewModels<DetailsViewModel> { requireContext().appComponent().viewModelFactory }

    private val args by navArgs<DetailsFragmentArgs>()

    override fun initBinding(inflater: LayoutInflater) = FragmentDetailsBinding.inflate(inflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getData(args.id)
        dataObserve()
        loadStateObserve()
    }

    private fun dataObserve() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.data.collect { item ->
                binding.apply {
                    date.setDateFormat(item.date * 1000)
                    name.text = item.name
                    counter.text = item.cores.first().toString()
                    status.isSelected = item.success
                    if (item.success) status.setText(R.string.success)
                    else status.setText(R.string.fail)
                    icon.loadingImage(item.icon)
                    description.text = item.details
                    crewRecycler.adapter = CrewAdapter(item.crewListItem)
                }

            }
        }
    }

    private fun loadStateObserve() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.loadState.collect { loadState ->
                binding.apply {
                    progressBar.isVisible = loadState == LoadState.LOADING
                    crewRecycler.isVisible = loadState == LoadState.SUCCESS_NOT_EMPTY_CREW
                    error.notInternet.isVisible = loadState == LoadState.ERROR
                    notCrew.isVisible = loadState == LoadState.SUCCESS_EMPTY_CREW
                }

            }
        }
    }
}
