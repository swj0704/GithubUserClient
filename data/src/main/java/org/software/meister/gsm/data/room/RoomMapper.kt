package org.software.meister.gsm.data.room

import org.software.meister.gsm.data.room.model.RoomUser
import org.software.meister.gsm.domain.model.UserItem

object RoomMapper {
    fun roomUserToUserItem(roomUser : RoomUser) : UserItem {
        return UserItem(
            roomUser.id,
            roomUser.name,
            roomUser.imageUrl
        )
    }

    fun userItemToRoomUser(userItem : UserItem) : RoomUser {
        return RoomUser(
            id = userItem.id,
            name = userItem.name,
            imageUrl = userItem.imageUrl
        )
    }
}