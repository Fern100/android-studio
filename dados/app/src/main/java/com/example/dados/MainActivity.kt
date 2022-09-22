package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttond6 = findViewById<Button>(R.id.buttond6)
        buttond6.setOnClickListener{
            Toast.makeText(this,"Boa sorte! ;)", Toast.LENGTH_SHORT).show()
        rolarDados(6)}

        val buttond12 = findViewById<Button>(R.id.buttond12)
        buttond12.setOnClickListener{
            Toast.makeText(this,"Boa sorte! ;)", Toast.LENGTH_SHORT).show()
        rolarDados2(lados2 = 12)
        }

        val buttond20 = findViewById<Button>(R.id.buttond20)
        buttond20.setOnClickListener{
            Toast.makeText(this,"Boa sorte! ;)", Toast.LENGTH_SHORT).show()
            rolarDados3(lados3 = 20)
        }
    }

    private fun rolarDados3(lados3: Int) {
        val rolagem = (1..lados3).random()

        val textResultado = findViewById<TextView>(R.id.textView)
        textResultado.text = rolagem.toString()
    }

    private fun rolarDados2(lados2: Int) {
        val rolagem = (1..lados2).random()

        val textResultado = findViewById<TextView>(R.id.textView)
        textResultado.text = rolagem.toString()
    }

    private fun rolarDados(lados: Int) {
    val rolagem = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textView)
        textResultado.text = rolagem.toString()
    }
}