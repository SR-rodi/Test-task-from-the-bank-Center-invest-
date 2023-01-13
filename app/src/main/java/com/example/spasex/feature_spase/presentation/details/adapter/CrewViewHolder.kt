package com.example.spasex.feature_spase.presentation.details.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.spasex.databinding.ItemCrewBinding
import com.example.spasex.feature_spase.domain.model.Crew

class CrewViewHolder(private val binding: ItemCrewBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Crew) {
        binding.name.text = item.name
        binding.agency.text = item.agency
        binding.status.text = item.status

    }
}