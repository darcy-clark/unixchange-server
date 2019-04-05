package com.unixchange.server.controllers

import com.unixchange.server.models.User
import com.unixchange.server.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController @Autowired constructor(
        val userService: UserService
) {

    @PostMapping("/signin")
    fun signin(@RequestBody user: User): ResponseEntity<User> {
        val userResponse = userService.signin(user)
        return when (userResponse) {
            null -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)
            else -> ResponseEntity.ok(user)
        }
    }

    @PostMapping("/signup")
    fun signup(@RequestBody user: User): ResponseEntity<User> {
        val userResponse = userService.signup(user)
        return when (userResponse) {
            null -> ResponseEntity.status(HttpStatus.CONFLICT).body(null)
            else -> ResponseEntity.status(HttpStatus.CREATED).body(user)
        }
    }
}
