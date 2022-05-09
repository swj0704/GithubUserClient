package org.software.meister.gsm.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import org.software.meister.gsm.data.room.model.RoomUser

@Database(entities = [RoomUser::class], version = 1, exportSchema = true)
abstract class UserDataBase : RoomDatabase(){
    abstract fun getDao() : UserDao
}