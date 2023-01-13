package com.example.spaceX.feature_spase.presentation.launches.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import com.example.spaceX.feature_spase.presentation.launches.adapter.holder.LoadStateViewHolder
import com.example.spaceX.databinding.ItemFooterProgressbarBinding

class LoadAdapter : LoadStateAdapter<LoadStateViewHolder>() {
    override fun onBindViewHolder(holder: LoadStateViewHolder, loadState: LoadState) {}

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState) = LoadStateViewHolder(
        ItemFooterProgressbarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )
}