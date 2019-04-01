package com.unixchange.server.services

import com.unixchange.server.models.ExchangeRequest
import com.unixchange.server.spring.ExchangeRequestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExchangeRequestService @Autowired constructor(
        val exchangeRequestRepository: ExchangeRequestRepository
) {

    fun storeExchangeRequest(exchangeRequest: ExchangeRequest) {
        exchangeRequestRepository.save(exchangeRequest)
    }

    fun retrieveExchangeRequests(): List<ExchangeRequest> {
        return exchangeRequestRepository.findAll()
    }
}
