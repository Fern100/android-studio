package com.example.cardview.model

data class Tarefa(
    var id:Long,
    var nome:String,
    var descricao:String,
    var responsável:String,
    var data:String,
    var status:Boolean,
    var categoria: Categoria
) {
}