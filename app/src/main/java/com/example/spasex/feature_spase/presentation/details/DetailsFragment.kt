package com.example.spasex.feature_spase.presentation.details

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.spasex.R
import com.example.spasex.core.BaseFragment
import com.example.spasex.core.appComponent
import com.example.spasex.core.setDateFormat
import com.example.spasex.core.state.LoadState
import com.example.spasex.databinding.FragmentDetailsBinding
import com.example.spasex.feature_spase.domain.model.Crew
import com.example.spasex.feature_spase.presentation.details.adapter.CrewAdapter
import kotlinx.coroutines.launch
import java.util.Calendar

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
                binding.date.setDateFormat(item.date * 1000)
                binding.name.text = item.name
                binding.counter.text = item.cores.first().toString()
                binding.status.isSelected = item.success
                if (item.success) binding.status.setText(R.string.success)
                else binding.status.setText(R.string.fail)
                binding.icon.load(item.icon)
                binding.description.text = item.details
                binding.crewRecycler.adapter = CrewAdapter(item.crewListItem)
            }
        }
    }

    private fun loadStateObserve() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.loadState.collect { loadState ->
                binding.progressBar.isVisible = loadState == LoadState.LOADING
                binding.crewRecycler.isVisible = loadState == LoadState.SUCCESS_NOT_EMPTY_CREW
                binding.error.notInternet.isVisible = loadState == LoadState.ERROR
                binding.notCrew.isVisible = loadState == LoadState.SUCCESS_EMPTY_CREW
            }
        }
    }
}
