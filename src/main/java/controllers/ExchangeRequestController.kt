package com.unixchange.server.controllers

import com.unixchange.server.models.ExchangeRequest
import com.unixchange.server.services.ExchangeRequestService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/exchange-requests")
class ExchangeRequestController {

    @PostMapping
    fun storeExchangeRequest(@RequestBody exchangeRequest: ExchangeRequest) {
        ExchangeRequestService.storeExchangeRequest(exchangeRequest)
    }

    @GetMapping
    fun retrieveExchangeRequests(): List<ExchangeRequest> {
        return ExchangeRequestService.retrieveExchangeRequests()
    }
}