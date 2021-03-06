package com.dicoding.kotlin.model

import com.google.gson.annotations.SerializedName

data class JokeApiResponse(
    @SerializedName("type") val  type: String,
    @SerializedName("value") val joke: Joke
)
