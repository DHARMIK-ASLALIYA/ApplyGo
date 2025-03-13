/**
 * This file contains the logic for generating OTP.
 */

package com.applygo.applyflow.helpers

import com.applygo.applyflow.objects.Helper

@Helper
class OTPGeneratorHelper {

    fun generateOTP() = (1..6).joinToString("") { "${(1..9).random()}" }

}
