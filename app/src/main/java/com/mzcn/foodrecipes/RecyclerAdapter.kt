package com.mzcn.foodrecipes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.mzcn.foodrecipes.databinding.PlaceholderRowLayoutBinding
import com.mzcn.foodrecipes.databinding.RecipesRowLayoutBinding

class RecyclerAdapter(private val items : List<String>) : RecyclerView.Adapter<RecyclerAdapter.RowLayoutViewHolder>() {

    private lateinit var placeholderRowLayoutBinding: PlaceholderRowLayoutBinding

    inner class RowLayoutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLayoutViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.placeholder_row_layout, parent, false)
        placeholderRowLayoutBinding = PlaceholderRowLayoutBinding.bind(view)

        return RowLayoutViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RowLayoutViewHolder, position: Int) {




    }
}