package com.example.spaceX.feature_spase.presentation.details.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.spaceX.feature_spase.domain.model.Crew
import com.example.spaceX.databinding.ItemCrewBinding

class CrewViewHolder(private val binding: ItemCrewBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Crew) {
        binding.name.text = item.name
        binding.agency.text = item.agency
        binding.status.text = item.status

    }
}