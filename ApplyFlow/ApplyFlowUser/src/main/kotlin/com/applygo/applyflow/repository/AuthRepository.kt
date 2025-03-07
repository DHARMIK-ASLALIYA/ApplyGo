/**
 * ====================================================================
 * AuthRepository
 *
 * Description: Repository interface for handling authentication-related
 *              database operations using MongoDB. Provides methods for
 *              storing and retrieving authentication documents.
 * ====================================================================
 */

package com.applygo.applyflow.repository

import com.applygo.applyflow.entity.AuthDoc
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthRepository : MongoRepository<AuthDoc, String> {

    fun findByEmail(email: String): AuthDoc?

}
