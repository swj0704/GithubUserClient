package org.software.meister.gsm.data.api

import io.reactivex.rxjava3.core.Single
import org.software.meister.gsm.domain.api.UserRepository
import org.software.meister.gsm.domain.model.UserItem

class UserRepositoryImpl(val api : GithubApis) : UserRepository {
    override fun searchUser(searchText: String, perPage: Int, page: Int): Single<List<UserItem>> {
        return api.searchUser(searchText, perPage, page).map { userList ->
            userList.map {
                UserMapper.userToUserItem(it)
            }
        }
    }
}