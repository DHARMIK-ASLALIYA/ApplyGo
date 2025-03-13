package com.applygo.applyflow.repository

import com.applygo.applyflow.entity.User
import com.google.api.core.ApiFuture
import com.google.cloud.firestore.WriteResult
import org.springframework.stereotype.Repository

@Repository
interface UserRepository {

    fun saveUser(user: User): ApiFuture<WriteResult>
    fun getUser(userId: String): User
    fun deleteUserdata(userId: String): ApiFuture<WriteResult>

}