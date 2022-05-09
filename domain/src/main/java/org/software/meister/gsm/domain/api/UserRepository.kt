package org.software.meister.gsm.domain.api

import io.reactivex.rxjava3.core.Single
import org.software.meister.gsm.domain.model.UserItem

interface UserRepository {
    fun searchUser(searchText: String, perPage : Int, page : Int): Single<List<UserItem>>
}