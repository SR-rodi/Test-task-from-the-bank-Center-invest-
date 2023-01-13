package com.example.spasex.feature_spase.presentation.launches.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.spasex.R
import com.example.spasex.core.setDateFormat
import com.example.spasex.databinding.ItemLaunchBinding
import com.example.spasex.feature_spase.domain.model.Launch

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
        binding.icon.load(item.icon)
    }
}