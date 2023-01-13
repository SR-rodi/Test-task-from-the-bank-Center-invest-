package com.example.spasex.feature_spase.presentation.details.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spasex.databinding.ItemCrewBinding
import com.example.spasex.feature_spase.domain.model.Crew

class CrewAdapter(
    private val list:List<Crew>
):RecyclerView.Adapter<CrewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= CrewViewHolder (
        ItemCrewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: CrewViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount()=list.size
}

class CrewViewHolder(private val binding:ItemCrewBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(item: Crew){

        binding.name.text = item.name
        binding.agency.text = item.agency
        binding.status.text = item.status

    }
}