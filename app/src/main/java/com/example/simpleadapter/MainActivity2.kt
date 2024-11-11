package com.example.simpleadapter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        /////Exercice2
        val liste=findViewById<ListView>(R.id.list)
        val button=findViewById<Button>(R.id.but)
        val langes= listOf(
            hashMapOf("nom" to "Francais","anneDaprition" to "2020","icone" to R.drawable.ic_launcher_background) ,
                    hashMapOf("nom" to "anglais","anneDaprition" to "1000","icone" to R.drawable.ic_launcher_background),
        hashMapOf("nom" to "arabic","anneDaprition" to "2000","icone" to R.drawable.ic_launcher_background),
        hashMapOf("nom" to "espaniol","anneDaprition" to "1999","icone" to R.drawable.ic_launcher_background)
        )
val myadapter=SimpleAdapter(this,langes,R.layout.layoutdonne, arrayOf("nom","anneDaprition","icone"),
    intArrayOf(R.id.text1,R.id.text2,R.id.image))
        liste.adapter=myadapter

        button.setOnClickListener{
            val myint=Intent(this@MainActivity2,MainActivity3::class.java)
            startActivity(myint)
        }
    }
}