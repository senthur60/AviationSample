package com.example.aviationsample.ui.theme.koin

import com.example.aviationsample.ui.theme.viewmodel.AviationViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val AviationModule = module {

    singleOf(::OkHttpClient) {
        val builder = OkHttpClient.Builder()
        builder.retryOnConnectionFailure(true)
        builder.build()
    }

    viewModelOf(::AviationViewModel)

}