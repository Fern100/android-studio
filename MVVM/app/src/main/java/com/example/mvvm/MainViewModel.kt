package com.example.mvvm

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var contador = 0
    fun addNumber(){
        contador++
    }
}