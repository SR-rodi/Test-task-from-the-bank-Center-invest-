package com.example.spaceX.feature_spase.presentation.details.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spaceX.feature_spase.domain.model.Crew
import com.example.spaceX.databinding.ItemCrewBinding

class CrewAdapter(
    private val list: List<Crew>
) : RecyclerView.Adapter<CrewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CrewViewHolder(
        ItemCrewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: CrewViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size
}