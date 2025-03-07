/**
 * This file contains the logic for generating OTP.
 */

package com.applygo.applyflow.logic

import org.springframework.stereotype.Service

@Service
class OTPGeneratorHelper {

    fun generateOTP() = (1..6).joinToString("") { "${(1..9).random()}" }

}
