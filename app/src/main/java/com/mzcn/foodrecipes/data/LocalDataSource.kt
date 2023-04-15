package com.mzcn.foodrecipes.data

import androidx.lifecycle.LiveData
import com.mzcn.foodrecipes.data.database.RecipesDAO
import com.mzcn.foodrecipes.data.database.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class LocalDataSource @Inject constructor(
    private val recipesDAO: RecipesDAO
) {

    suspend fun insertRecipes(recipesEntity: RecipesEntity){
        recipesDAO.insertRecipes(recipesEntity)
    }

    fun readDatabase() : LiveData<List<RecipesEntity>>{
        return recipesDAO.readRecipes()
    }
}