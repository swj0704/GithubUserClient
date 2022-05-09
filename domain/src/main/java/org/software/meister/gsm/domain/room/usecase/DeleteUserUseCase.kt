package org.software.meister.gsm.domain.room.usecase

import io.reactivex.rxjava3.core.Completable
import org.software.meister.gsm.domain.UseCase
import org.software.meister.gsm.domain.room.RoomUserRepository

class DeleteUserUseCase(val repository: RoomUserRepository) : UseCase {
    operator fun invoke(id : Int) : Completable{
        return repository.deleteById(id)
    }
}