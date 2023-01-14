package com.example.spaceX.core.pagin_sourc

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.spaceX.feature_spase.data.query.childe.options.Options
import com.example.spaceX.feature_spase.data.query.childe.options.Sort
import com.example.spaceX.feature_spase.data.query.childe.query.DateUtc
import com.example.spaceX.feature_spase.data.query.childe.query.Query
import com.example.spaceX.feature_spase.data.query.parent.QueryAndOptions
import com.example.spaceX.feature_spase.domain.model.Launch
import com.example.spaceX.feature_spase.domain.usecase.LaunchUseCase

class LaunchesPagingSource(
    private val launchUseCase: LaunchUseCase,
    private val year: Int
) :
    PagingSource<Int, Launch>() {

    override fun getRefreshKey(state: PagingState<Int, Launch>) = FIRST_PAGE
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Launch> {
        val page = params.key ?: FIRST_PAGE

        return kotlin.runCatching {
            launchUseCase.getLaunches(createQueryAndOptions(page, year))
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

    private fun createQueryAndOptions(page: Int, year: Int): QueryAndOptions {
        val dataUtc = "$year-00-00T00:00:00.000Z"
        return QueryAndOptions(Query(DateUtc(dataUtc)), Options(page, Sort(ASCENDING)))
    }


    companion object {
        private const val FIRST_PAGE = 1
        private const val ASCENDING = "asc"
    }

}