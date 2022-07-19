package com.example.coordinatorlayouttest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(private val list: MutableList<String>) : RecyclerView.Adapter<RvAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.text.text = list[position]
    }

    override fun getItemCount() = list.size

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var text: TextView

        init {
            text = view.findViewById(R.id.text)
        }

    }

}