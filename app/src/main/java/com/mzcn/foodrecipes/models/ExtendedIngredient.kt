package com.mzcn.foodrecipes.models


import com.google.gson.annotations.SerializedName

data class ExtendedIngredient(
    @SerializedName("amount")
    val amount: Double,
    @SerializedName("consistency")
    val consistency: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val nameClean: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("unit")
    val unit: String
)