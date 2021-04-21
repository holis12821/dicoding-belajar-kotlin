package com.dicoding.kotlin.model

import com.google.gson.annotations.SerializedName

data class Joke(
    /*initialize name from JSON
    * harus sesuai dengan nama dari JSON nya jika beda akan error*/
    @SerializedName("id") val jokeId: Int,
    @SerializedName("joke") val jokeText: String
)
