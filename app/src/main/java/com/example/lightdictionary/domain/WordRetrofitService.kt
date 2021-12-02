package com.example.lightdictionary.domain

import com.example.lightdictionary.data.WordEntity
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

private const val TARIFF_URL = "words/search"

interface WordRetrofitService {
    @GET(TARIFF_URL)
    fun getWord(@Query("search") search: String): Deferred<List<WordEntity>>
}