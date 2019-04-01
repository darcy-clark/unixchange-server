package com.unixchange.server.spring

import com.unixchange.server.models.ExchangeRequest
import org.springframework.data.mongodb.repository.MongoRepository

interface ExchangeRequestRepository : MongoRepository<ExchangeRequest, String>
