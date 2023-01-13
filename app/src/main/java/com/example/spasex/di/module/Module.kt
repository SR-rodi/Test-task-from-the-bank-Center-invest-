package com.example.spasex.di.module

import com.example.spasex.feature_spase.data.api.SpaseApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

@Module(includes = [AppBind::class])
class Module {
    @Provides
    fun providesRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideSpaseApi(retrofit: Retrofit) = retrofit.create<SpaseApi>()

    companion object {
        private const val BASE_URL = "https://api.spacexdata.com/v4/"
    }
}