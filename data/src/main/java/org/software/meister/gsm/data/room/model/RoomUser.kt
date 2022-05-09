package org.software.meister.gsm.data.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoomUser(
    @PrimaryKey val id : Int,
    val name : String,
    val imageUrl : String
)