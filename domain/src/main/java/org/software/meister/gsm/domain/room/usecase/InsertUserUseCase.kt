package org.software.meister.gsm.domain.room.usecase

import io.reactivex.rxjava3.core.Completable
import org.software.meister.gsm.domain.UseCase
import org.software.meister.gsm.domain.model.UserItem
import org.software.meister.gsm.domain.room.RoomUserRepository

class InsertUserUseCase(val repository: RoomUserRepository) : UseCase {
    operator fun invoke(user : UserItem) : Completable{
        return repository.insert(user)
    }
}