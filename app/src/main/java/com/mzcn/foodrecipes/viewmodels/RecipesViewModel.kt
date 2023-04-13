package com.mzcn.foodrecipes.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.mzcn.foodrecipes.util.Constants.Companion.API_KEY
import com.mzcn.foodrecipes.util.Constants.Companion.QUERY_API_KEY
import com.mzcn.foodrecipes.util.Constants.Companion.QUERY_AddRecipeInformation
import com.mzcn.foodrecipes.util.Constants.Companion.QUERY_DIET
import com.mzcn.foodrecipes.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.mzcn.foodrecipes.util.Constants.Companion.QUERY_NUMBER
import com.mzcn.foodrecipes.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {

    fun applyQueries() : HashMap<String, String>{
        val queries : HashMap<String,String> = HashMap()

        queries[QUERY_NUMBER] = "50"
        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_TYPE] = "snack"
        queries[QUERY_DIET] = "vegan"
        queries[QUERY_AddRecipeInformation] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }
}