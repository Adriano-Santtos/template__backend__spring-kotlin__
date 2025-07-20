package com.template.change_it.controller.advice

import com.template.change_it.exceptions.StatusNotAllowedException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(StatusNotAllowedException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleStatusNotAllowedException(e: StatusNotAllowedException): ResponseEntity<String> {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.message)
    }
}
