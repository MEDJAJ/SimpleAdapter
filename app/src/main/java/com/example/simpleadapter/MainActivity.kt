package com.example.simpleadapter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Exercice3
      val lv=findViewById<ListView>(R.id.affichage)
        val produit= listOf(
            mapOf("nom" to "Algerie","monaie" to "DinarAlgerie","codeiso" to "DZD"),
            mapOf("nom" to "Palstine","monaie" to "Pound","codeiso" to "PP"),
            mapOf("nom" to "Algharistan","monaie" to "Afghani","codeiso" to "AFN"),
            mapOf("nom" to "Arabi Saoudite","monaie" to "Riyal Soudien","codeiso" to "SAR"),
            mapOf("nom" to "Belgique","monaie" to "Euro","codeiso" to "EUR"),
            mapOf("nom" to "Benin","monaie" to "France CFA","codeiso" to "XEF"),
            mapOf("nom" to "Brésil","monaie" to "Réal bresile","codeiso" to "BRL"),
            mapOf("nom" to "Cote d'lvoir","monaie" to "France CFA","codeiso" to "XOF"),

        )
        val adapter=SimpleAdapter(this,produit,R.layout.list_item_with_image, arrayOf("nom","monaie","codeiso"),
            intArrayOf(R.id.codeep, R.id.mo,R.id.codeiso)
        )
        lv.adapter=adapter

        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            val i =Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(i)
        }
    }
}