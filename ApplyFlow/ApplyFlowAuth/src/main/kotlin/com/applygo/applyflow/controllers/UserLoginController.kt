/**
 * This controller is responsible for handling the user login requests.
 * It sends OTP on the user's email and verifies the OTP entered by the user.
 * It uses the AuthServices to send OTP on email and verify OTP.
 * It returns the response in the form of ApiResponse.
 */

package com.applygo.applyflow.controllers

import com.applygo.applyflow.entity.UserAuthReq
import com.applygo.applyflow.objects.ApiResponse
import com.applygo.applyflow.services.AuthServices
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/auth/v1")
class UserLoginController(val authServices: AuthServices) {

    @PostMapping("/send")
    fun sendOTPOnEmail(@Valid @RequestBody userAuthReq: UserAuthReq): ResponseEntity<ApiResponse> =
        authServices.sendOTPOnEmail(userAuthReq)

    @PostMapping("/verify")
    fun verifyOTP(@Valid @RequestBody userAuthReq: UserAuthReq): ResponseEntity<ApiResponse> =
        authServices.verifyOTP(userAuthReq.email, userAuthReq.oneTimePassword)

}