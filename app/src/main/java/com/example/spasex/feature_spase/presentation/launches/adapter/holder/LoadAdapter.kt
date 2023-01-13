package com.example.spasex.feature_spase.presentation.launches.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import com.example.spasex.databinding.ItemFooterProgressbarBinding

class LoadAdapter:LoadStateAdapter<LoadStateViewHolder>() {
    override fun onBindViewHolder(holder: LoadStateViewHolder, loadState: LoadState) {}

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState) = LoadStateViewHolder(
        ItemFooterProgressbarBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )
}