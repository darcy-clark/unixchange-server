package com.unixchange.server.services

import com.unixchange.server.Context
import com.unixchange.server.Session
import com.unixchange.server.models.User
import com.unixchange.server.spring.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(
        val userRepository: UserRepository
) {

    fun signin(user: User): User? {
        var userResponse: User? = null

        userRepository.findOne(Example.of(user)).ifPresent {
            userResponse = it
            Context.session = Session(user)
        }

        return userResponse
    }

    fun signup(user: User): User? {
        var userResponse: User? = null

        if (!userRepository.exists(Example.of(user))) {
            userResponse = user
            userRepository.insert(user)
            Context.session = Session(user)
        }

        return userResponse
    }
}
