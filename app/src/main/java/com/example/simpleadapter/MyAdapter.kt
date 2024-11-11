package com.example.simpleadapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class MyAdapter(val context: Context, val liste: ArrayList<HashMap<String, String>>) : BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int = liste.size

    override fun getItem(position: Int): Any = liste[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = convertView ?: inflater.inflate(R.layout.item_personne, parent, false)
        val nomTextView = view.findViewById<TextView>(R.id.tvNom)


        val personne = liste[position]
        val nom = personne["nom"]
        val prenom = personne["prenom"]
        val age = personne["age"]?.toInt() ?: 0


        nomTextView.text = "$prenom $nom $age"


        when {
            age < 18 -> nomTextView.setTextColor(Color.GREEN)
            age > 60 -> nomTextView.setTextColor(Color.BLUE)
            else -> nomTextView.setTextColor(Color.BLACK)
        }

        return view
    }
}
