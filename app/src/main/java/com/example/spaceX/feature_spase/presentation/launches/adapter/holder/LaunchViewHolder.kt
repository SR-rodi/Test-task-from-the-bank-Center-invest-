package com.example.spaceX.feature_spase.presentation.launches.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import com.example.spaceX.core.loadingImage
import com.example.spaceX.core.setDateFormat
import com.example.spaceX.feature_spase.domain.model.Launch
import com.example.spaceX.R
import com.example.spaceX.databinding.ItemLaunchBinding

class LaunchViewHolder(private val binding: ItemLaunchBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Launch, onClickItem: (id: String) -> Unit) {
        binding.root.setOnClickListener {
            onClickItem(item.id)
        }

        binding.name.text = item.name
        binding.counter.text = item.cores.first().toString()
        binding.status.isSelected = item.success
        binding.date.setDateFormat(item.date * 1000)
        if (item.success) binding.status.setText(R.string.success)
        else binding.status.setText(R.string.fail)
        binding.icon.loadingImage(item.icon)
    }
}