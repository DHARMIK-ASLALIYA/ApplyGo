package com.applygo.applyflow.repository

import com.applygo.applyflow.entity.UserPayload
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserPayloadRepository : MongoRepository<UserPayload, String> {

    fun findByIdIn(ids: List<String>): List<UserPayload>
    fun existsUserPayloadById(userId: String): Boolean
    fun deleteUserPayloadById(id: String): UserPayload

}