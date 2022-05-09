package org.software.meister.gsm.domain.room.usecase

import io.reactivex.rxjava3.core.Single
import org.software.meister.gsm.domain.UseCase
import org.software.meister.gsm.domain.model.UserItem
import org.software.meister.gsm.domain.room.RoomUserRepository

class GetRoomUserListUseCase(val repository: RoomUserRepository) : UseCase {
    operator fun invoke() : Single<List<UserItem>>{
        return repository.getAll()
    }
}