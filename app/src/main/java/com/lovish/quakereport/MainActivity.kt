package com.lovish.quakereport

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val earthquakes: ArrayList<Earthquake> = ArrayList()
        earthquakes.add(Earthquake(232, "San Francisco", "efdsfds"))
        earthquakes.add(Earthquake(232, "San Francisco", "efdsfds"))
        earthquakes.add(Earthquake(232, "San Francisco", "efdsfds"))
        earthquakes.add(Earthquake(232, "San Francisco", "efdsfds"))
        earthquakes.add(Earthquake(212, "San Francisco", "efdsfds"))
        earthquakes.add(Earthquake(232, "San Francisco", "efdsfds"))
        val items = EarthquakeAdapter(earthquakes)
        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        rv.adapter = items
    }
}
