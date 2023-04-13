package com.mzcn.foodrecipes.models

import androidx.recyclerview.widget.DiffUtil
import com.mzcn.foodrecipes.models.Result


class RecipesDiffUtil(
    private val oldList: List<Result>,
    private val newList: List<Result>


) : DiffUtil.Callback() {


    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }


    //Bu metod, eski listedeki bir öğe ile yeni listedeki aynı pozisyondaki öğenin aynı öğe olup olmadığını kontrol eder.
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    //içeriğini kontrol eder
    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }


}