package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    private lateinit var mainViewModel: MainViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        mainViewModel = ViewModelProvider(this).get(mainViewModel::class.java)
        
        binding.textNumero.text = mainViewModel.contador.toString()
        
        binding.buttonClicar.setOnClickListener{
            mainViewModel.addNumber()
            binding.textNumero.text = mainViewModel.contador.toString()
        }
    }
}