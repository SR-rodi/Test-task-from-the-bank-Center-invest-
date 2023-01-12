package com.example.spasex.feature_spase.data.api

import com.example.spasex.feature_spase.data.dto.crew.CrewDto
import com.example.spasex.feature_spase.data.dto.launches.ResponseLaunch
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface SpaseApi {

    @POST("launches/query")
    suspend fun getLaunches(): ResponseLaunch

    @GET("crew/{id}")
    suspend fun getCrew(@Path("id") crewId: String): CrewDto

}