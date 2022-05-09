package org.software.meister.gsm.data.api

import io.reactivex.rxjava3.core.Single
import org.software.meister.gsm.data.api.model.User
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApis {
    @GET("search/users")
    fun searchUser(
        @Query("q") searchText : String,
        @Query("per_page") pagePerUser : Int,
        @Query("page") page : Int
    ) : Single<List<User>>
}