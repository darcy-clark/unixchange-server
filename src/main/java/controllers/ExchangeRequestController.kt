package com.unixchange.server.controllers

import com.unixchange.server.models.ExchangeRequest
import com.unixchange.server.services.ExchangeRequestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/exchange-requests")
class ExchangeRequestController @Autowired constructor(
        val exchangeRequestService: ExchangeRequestService
) {

    @PostMapping
    fun storeExchangeRequest(@RequestBody exchangeRequest: ExchangeRequest) {
        exchangeRequestService.storeExchangeRequest(exchangeRequest)
    }

    @GetMapping
    fun retrieveExchangeRequests(): List<ExchangeRequest> {
        return exchangeRequestService.retrieveExchangeRequests()
    }
}
