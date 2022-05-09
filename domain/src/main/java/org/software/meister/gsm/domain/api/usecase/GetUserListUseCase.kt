package org.software.meister.gsm.domain.api.usecase

import io.reactivex.rxjava3.core.Single
import org.software.meister.gsm.domain.UseCase
import org.software.meister.gsm.domain.api.UserRepository
import org.software.meister.gsm.domain.model.UserItem

class GetUserListUseCase(val repository : UserRepository) : UseCase {
    operator fun invoke(searchText : String, page : Int) : Single<List<UserItem>>{
        return repository.searchUser(searchText, 30, page)
    }
}