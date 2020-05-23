package com.lovish.quakereport

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class  Earthquake(mag : Int, place : String, time : String){
    var mag = mag
    var place = place
    var time = time
}

class EarthquakeAdapter(val earthquakes : ArrayList<Earthquake>) : RecyclerView.Adapter<EarthquakeAdapter.viewHolder>(){
    class viewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var txtMag = itemView.findViewById(R.id.mag) as TextView
        var txtPlace = itemView.findViewById(R.id.place) as TextView
        var txtTime = itemView.findViewById(R.id.time) as TextView
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder = viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))

    override fun getItemCount() = earthquakes.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.txtMag.text = earthquakes[position].mag.toString()
        holder.txtPlace.text = earthquakes[position].place
        holder.txtTime.text = earthquakes[position].time

    }

}