package org.software.meister.gsm.domain.room

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import org.software.meister.gsm.domain.model.UserItem

interface RoomUserRepository {
    fun getAll(): Single<List<UserItem>>
    fun insert(item: UserItem): Completable
    fun deleteById(id: Int): Completable
    fun getFavoriteByName(name: String): Single<List<UserItem>>
}