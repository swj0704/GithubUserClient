package org.software.meister.gsm.data.room

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import org.software.meister.gsm.domain.model.UserItem
import org.software.meister.gsm.domain.room.RoomUserRepository

class RoomUserRepositoryImpl(val dao: UserDao) : RoomUserRepository {
    override fun getAll(): Single<List<UserItem>> {
        return dao.getAll().map { userList ->
            userList.map {
                RoomMapper.roomUserToUserItem(it)
            }
        }
    }

    override fun insert(item: UserItem): Completable {
        return dao.insert(RoomMapper.userItemToRoomUser(item))
    }

    override fun deleteById(id: Int): Completable {
        return dao.deleteById(id)
    }

    override fun getFavoriteByName(name: String): Single<List<UserItem>> {
        return dao.searchDatabase(name).map {  userList ->
            userList.map {
                RoomMapper.roomUserToUserItem(it)
            }
        }
    }
}