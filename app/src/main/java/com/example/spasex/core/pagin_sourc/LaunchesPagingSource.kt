package com.example.spasex.core.pagin_sourc

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.spasex.feature_spase.domain.model.Launch
import com.example.spasex.feature_spase.domain.usecase.LaunchUseCase

class LaunchesPagingSource(private val launchUseCase: LaunchUseCase) :
    PagingSource<Int, Launch>() {

    override fun getRefreshKey(state: PagingState<Int, Launch>) = FIRST_PAGE
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Launch> {
        val page = params.key ?: FIRST_PAGE

        return kotlin.runCatching {
            launchUseCase.getLaunches(page)
        }.fold(
            onSuccess = {
                LoadResult.Page(
                    data = it.docs,
                    prevKey = if (page == 1) null else page - 1,
                    nextKey = if (it.totalPages == page) null else page + 1
                )
            },
            onFailure = { LoadResult.Error(it) }
        )
    }

    companion object {
        private const val FIRST_PAGE = 1
    }
}