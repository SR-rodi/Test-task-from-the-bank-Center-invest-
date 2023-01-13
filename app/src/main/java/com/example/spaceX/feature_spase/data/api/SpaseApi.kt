package com.example.spaceX.feature_spase.data.api

import com.example.spaceX.feature_spase.data.dto.crew.CrewDto
import com.example.spaceX.feature_spase.domain.query.parent.QueryAndOptions
import com.example.spaceX.feature_spase.data.dto.launches.LaunchesDto
import com.example.spaceX.feature_spase.data.dto.launches.ResponseLaunch
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface SpaseApi {

    @POST("launches/query")
    suspend fun getLaunches(@Body query: QueryAndOptions): ResponseLaunch

    @GET("launches/{id}")
    suspend fun getOneLaunches(@Path("id") launchId: String): LaunchesDto

    @GET("crew/{id}")
    suspend fun getCrewById(@Path("id") crewId: String): CrewDto

}