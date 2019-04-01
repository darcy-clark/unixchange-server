package com.unixchange.server.controllers

import com.unixchange.server.Context
import com.unixchange.server.Session
import com.unixchange.server.models.User
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/signin")
class SigninController {

    @PostMapping
    fun signin(@RequestBody user: User) {
        println(user.username)
        Context.session = Session(user)
    }
}