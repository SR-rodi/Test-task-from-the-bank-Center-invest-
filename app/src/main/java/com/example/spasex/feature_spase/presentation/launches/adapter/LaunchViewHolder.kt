package com.example.spasex.feature_spase.presentation.launches.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.spasex.databinding.ItemLaunchBinding
import com.example.spasex.feature_spase.domain.model.Launch

class LaunchViewHolder(private val binding: ItemLaunchBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Launch,onClickItem:(id:String)->Unit) {
        binding.root.setOnClickListener{
            onClickItem(item.id)
        }
        binding.icon.load(item.icon)
    }
}