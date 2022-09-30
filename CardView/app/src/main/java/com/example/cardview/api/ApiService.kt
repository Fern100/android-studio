package com.example.cardview.api

import com.example.cardview.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("categoria")
            suspend fun ListCategoria(): Response<List<Categoria>>
}