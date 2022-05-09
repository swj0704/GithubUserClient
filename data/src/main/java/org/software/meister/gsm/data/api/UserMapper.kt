package org.software.meister.gsm.data.api

import org.software.meister.gsm.data.api.model.User
import org.software.meister.gsm.domain.model.UserItem

object UserMapper {
    fun userToUserItem(user : User) : UserItem {
        return UserItem(
            user.id,
            user.name,
            user.imageUrl
        )
    }
}