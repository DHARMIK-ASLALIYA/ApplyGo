package com.applygo.applyflow.entity

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.*

@Document
data class AuthDoc(
    @Id var pinId: String? = null,
    @field:NotEmpty(message = "Email can't be null") @field:Email(message = "Enter valid Email Address") var email: String,
    @field:NotEmpty(message = "OTP can't be null") var oneTimePassword: String,
    @field:Indexed(name = "createdAtIndex", expireAfter = "150s") var createdAt: Date = Date.from(Instant.now())
)

data class UserAuthReq(
    @field:NotEmpty(message = "Email can't be Empty") @field:Email(message = "Enter valid Email Address") var email: String,
    var oneTimePassword: String
)

data class AuthenticationBodyForFirebase(
    var email: String,
    var userHandle: String
)
