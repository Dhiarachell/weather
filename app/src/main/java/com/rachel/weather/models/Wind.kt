package com.rachel.weather.models

import com.google.gson.annotations.SerializedName

data class Wind (
    @field:SerializedName("speed")
    val speed: Double,

    @field:SerializedName("cdeg")
    val deg: Int,

    @field:SerializedName("gust")
    val gust: Double

        )


