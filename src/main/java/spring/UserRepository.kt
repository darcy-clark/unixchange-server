package com.unixchange.server.spring

import com.unixchange.server.models.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String>
