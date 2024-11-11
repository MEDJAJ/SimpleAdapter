package com.example.simpleadapter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ///Exercice4
  val l=findViewById<ListView>(R.id.capital)

        val pays= listOf(
            mapOf("nom_pay" to "Angola","capital" to "lunda","continent" to "Afrique"),
            mapOf("nom_pay" to "Angola","capital" to "lunda","continent" to "Afrique"),
        mapOf("nom_pay" to "Angola","capital" to "lunda","continent" to "Afrique"),
        mapOf("nom_pay" to "Angola","capital" to "lunda","continent" to "Afrique"),
        mapOf("nom_pay" to "Angola","capital" to "lunda","continent" to "Afrique"),
        mapOf("nom_pay" to "Angola","capital" to "lunda","continent" to "Afrique")
        )
        val adapter=SimpleAdapter(this,pays,R.layout.listepays, arrayOf("nom_pay","capital","continent"),
            intArrayOf(R.id.t1,R.id.t2,R.id.t3)

        )
        l.adapter=adapter

        val btn=findViewById<Button>(R.id.bb)
        btn.setOnClickListener{
            val my_intent= Intent(this@MainActivity3,MainActivity4::class.java)
            startActivity(my_intent)
        }
    }
}