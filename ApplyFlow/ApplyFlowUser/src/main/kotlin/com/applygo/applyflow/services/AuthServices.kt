/**
 * ====================================================================
 * AuthServices
 *
 * Description: This interface defines authentication service methods
 *              for sending OTP on email and verifying OTP for a user.
 * ====================================================================
 */

package com.applygo.applyflow.services

import com.applygo.applyflow.entity.AuthenticationBodyForFirebase
import com.applygo.applyflow.entity.UserAuthReq
import com.applygo.applyflow.objects.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
interface AuthServices {

    fun sendOTPOnEmail(userLogin: UserAuthReq): ResponseEntity<ApiResponse>
    fun verifyOTP(email: String, oneTimePassword: String): ResponseEntity<ApiResponse>
    fun signViaEmailOnFirebase(authenticationBodyForFirebase: AuthenticationBodyForFirebase): ResponseEntity<ApiResponse>

}
