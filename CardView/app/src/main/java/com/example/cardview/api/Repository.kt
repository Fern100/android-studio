package com.example.cardview.api

import com.example.cardview.model.Categoria
import retrofit2.Response

class Repository {
    suspend fun listCategoria(): Response<List<Categoria>> {
        return RetrofitInstance.api.ListCategoria()}
}