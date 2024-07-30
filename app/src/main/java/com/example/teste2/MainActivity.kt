package com.example.teste2

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Exibe um popup na tela
        Toast.makeText(this, "Bem vindo a aula de PAM", Toast.LENGTH_SHORT).show()

        // Cria um TextView e define seu texto
        val textView = TextView(this)
        textView.text = "frutas"
        setContentView(textView)
    }
}