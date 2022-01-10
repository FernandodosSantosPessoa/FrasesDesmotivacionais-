package com.example.frasesdesmotivacionais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.frasesdesmotivacionais.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val frases = listOf("O trabalho danifica o homem", "Nunca foi azar sempre foi incompetência",
            "É errando que se aprende a errar", "Foi só um dia ruim, amanhã será pior, descanse",
            "Tentar é o primeiro passo rumo ao fracasso", "Nem tentar é melhor que desistir",
            "Onde há vontade, há chance de dar errado", "O começo é difícil mas o final é pior",
            "Disciplina é a ponte entre metas e as suas frustrações", "Os humilhados serão humilhados)")

        binding.txtFrases.text= "Sorrir pra não chorar"

        binding.btnNovaFrase.setOnClickListener{
            val randomNumber= Random.nextInt(0, frases.size -1)
          binding.txtFrases.text= frases.get(randomNumber)


        }
    }

}

