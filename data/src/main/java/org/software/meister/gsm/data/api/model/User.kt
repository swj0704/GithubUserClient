package org.software.meister.gsm.data.api.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("login")
    val name : String,
    @SerializedName("avatar_url")
    val imageUrl : String,
    @SerializedName("id")
    val id : Int
)