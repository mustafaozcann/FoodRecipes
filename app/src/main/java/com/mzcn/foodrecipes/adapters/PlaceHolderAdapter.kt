package com.mzcn.foodrecipes.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mzcn.foodrecipes.R

class PlaceHolderAdapter : RecyclerView.Adapter<PlaceHolderAdapter.PlaceHolderViewHolder>() {
    class PlaceHolderViewHolder(itemView : View)  : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceHolderViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.placeholder_row_layout, parent, false)
        return PlaceHolderViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: PlaceHolderViewHolder, position: Int) {

    }
}