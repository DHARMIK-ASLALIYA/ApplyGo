/**
 * This class is the implementation of the AuthServices interface.
 * It is responsible for sending OTP on email and verifying OTP.
 * It uses MailSenderHelper to send OTP on email and AuthRepository to save and retrieve AuthDoc.
 * It uses BCryptPasswordEncoder to encode and match OTP.
 */

package com.applygo.applyflow.logic

import com.applygo.applyflow.entity.AuthDoc
import com.applygo.applyflow.entity.UserAuthReq
import com.applygo.applyflow.exceptions.ApplyGoException
import com.applygo.applyflow.objects.ApiResponse
import com.applygo.applyflow.repository.AuthRepository
import com.applygo.applyflow.services.AuthServices
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthServiceLogic(
    val mailSenderHelper: MailSenderHelper, val authRepository: AuthRepository
) : AuthServices {

    override fun sendOTPOnEmail(userLogin: UserAuthReq): ResponseEntity<ApiResponse> {
        if (authRepository.findByEmail(userLogin.email) != null) throw ApplyGoException("Login Document already exists.")
        val newOneTimePassword = mailSenderHelper.sendEmailOTP(userLogin.email)
        if (newOneTimePassword.isNotEmpty()) {
            authRepository.save(
                AuthDoc(
                    email = userLogin.email, oneTimePassword = BCryptPasswordEncoder().encode(newOneTimePassword)
                )
            )
            return ResponseEntity(ApiResponse("OTP sent successfully.", true), HttpStatus.CREATED)
        } else throw ApplyGoException("Unexpected error occurred. Try again later.")
    }

    override fun verifyOTP(email: String, oneTimePassword: String): ResponseEntity<ApiResponse> {
        val authDoc = authRepository.findByEmail(email) ?: throw ApplyGoException("Login Document Not Found.")
        if (BCryptPasswordEncoder().matches(
                oneTimePassword, authDoc.oneTimePassword
            )
        ) return ResponseEntity(ApiResponse("OTP verification successful", true), HttpStatus.OK)
        else throw ApplyGoException("OTP not matched.")
    }

}
