package com.example.spaceX.feature_spase.presentation.launches.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.spaceX.feature_spase.domain.model.Launch

class LauncherDiffUtil : DiffUtil.ItemCallback<Launch>() {

    override fun areItemsTheSame(oldItem: Launch, newItem: Launch) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Launch, newItem: Launch) = oldItem == newItem
}