/**
 * This file contains the global exception handler for the application.
 */

package com.applygo.applyflow.exceptions

import com.applygo.applyflow.objects.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.security.core.AuthenticationException
import org.springframework.validation.FieldError
import org.springframework.validation.ObjectError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.util.function.Consumer

@RestControllerAdvice
class GlobalException {

    @ExceptionHandler(ApplyGoException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun applyGoExceptionHandler(ex: ApplyGoException): ResponseEntity<ApiResponse> =
        ResponseEntity(ApiResponse(ex.message.toString(), false), HttpStatus.BAD_REQUEST)

    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun validationExceptionHandler(ex: MethodArgumentNotValidException): ResponseEntity<Map<String, String?>> {
        val response: MutableMap<String, String?> = HashMap()
        ex.allErrors.forEach((Consumer { objectError: ObjectError ->
            val fieldName = (objectError as FieldError).field
            val message = objectError.getDefaultMessage()
            response[fieldName] = message
        }))
        return ResponseEntity<Map<String, String?>>(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun internalServerExceptionHandler(ex: HttpMessageNotReadableException): ResponseEntity<ApiResponse> =
        ResponseEntity(ApiResponse(ex.message.toString(), false), HttpStatus.BAD_REQUEST)

    @ExceptionHandler(IndexOutOfBoundsException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun indexExceptionHandler(ex: HttpMessageNotReadableException): ResponseEntity<ApiResponse> =
        ResponseEntity(ApiResponse(ex.message.toString(), false), HttpStatus.BAD_REQUEST)

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun globalExceptionHandler(ex: Exception): ResponseEntity<ApiResponse> =
        ResponseEntity(ApiResponse("An unexpected error occurred", false), HttpStatus.INTERNAL_SERVER_ERROR)

    @ExceptionHandler(AccessDeniedException::class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    fun handleAccessDeniedException(ex: AccessDeniedException): ResponseEntity<ApiResponse> =
        ResponseEntity(ApiResponse("Access denied", false), HttpStatus.FORBIDDEN)

    @ExceptionHandler(AuthenticationException::class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    fun handleUnauthorizedException(ex: AuthenticationException): ResponseEntity<ApiResponse> =
        ResponseEntity(ApiResponse("ACCESS DENIED [UNAUTHORIZED]", false), HttpStatus.UNAUTHORIZED)

}