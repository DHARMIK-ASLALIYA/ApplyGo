/**
 * This file contains the UserAuthReq data class
 */

package com.applygo.applyflow.entity

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty

data class UserAuthReq(
    @field:NotEmpty(message = "Email can't be Empty")
    @field:Email(message = "Enter valid Email Address")
    var email: String,
    var oneTimePassword: String
)
