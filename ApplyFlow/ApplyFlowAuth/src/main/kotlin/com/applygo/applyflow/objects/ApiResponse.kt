/**
 * ====================================================================
 * ApiResponse
 *
 * Description: A data class that represents a standard API response.
 *              It contains a message, a success flag, and a timestamp.
 * ====================================================================
 */

package com.applygo.applyflow.objects

import java.util.*

data class ApiResponse(
    var message: String,
    var success: Boolean,
    var dateTime: String = Date().toString()
)
