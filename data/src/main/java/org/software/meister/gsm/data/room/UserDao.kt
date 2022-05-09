package org.software.meister.gsm.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import org.software.meister.gsm.data.room.model.RoomUser

@Dao
interface UserDao {
    @Query("select * from RoomUser")
    fun getAll(): Single<List<RoomUser>>

    @Insert
    fun insert(item: RoomUser): Completable

    @Query("delete from RoomUser WHERE id=:id")
    fun deleteById(id: Int): Completable

    @Query("select * from RoomUser WHERE name LIKE :searchText")
    fun searchDatabase(searchText : String) : Single<List<RoomUser>>
}