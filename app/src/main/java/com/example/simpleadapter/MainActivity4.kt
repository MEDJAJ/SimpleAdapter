package com.example.simpleadapter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val listView = findViewById<ListView>(R.id.lvvv)
        val listePersonnes = arrayListOf(
            hashMapOf("nom" to "ALAMI", "prenom" to "Mohammed", "age" to "38"),
            hashMapOf("nom" to "ALAOUY", "prenom" to "Taha", "age" to "65"),
            hashMapOf("nom" to "IQBAL", "prenom" to "Imane", "age" to "15"),
            hashMapOf("nom" to "ALAMI", "prenom" to "Nada", "age" to "24"),
            hashMapOf("nom" to "SELLAM", "prenom" to "Issam", "age" to "12")
        )


        val adapter = MyAdapter(this, listePersonnes)
        listView.adapter = adapter

    }
}
