package com.example.spasex.feature_spase.presentation.launches.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import com.example.spasex.databinding.ItemLaunchBinding
import com.example.spasex.feature_spase.domain.model.Launch
import com.example.spasex.feature_spase.presentation.launches.adapter.holder.LaunchViewHolder

class LaunchesAdapter(
    private val onClickItem: (id: String) -> Unit
) : PagingDataAdapter<Launch, LaunchViewHolder>(LauncherDiffUtil()) {

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) {
        getItem(position)?.let { item ->
            holder.bind(item) { id -> onClickItem(id) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = LaunchViewHolder(
        ItemLaunchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )
}