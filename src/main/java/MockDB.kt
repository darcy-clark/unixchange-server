package com.unixchange.server

import com.unixchange.server.models.ExchangeRequest

class MockDB {

    companion object {

        private val exchangeRequests = mutableListOf<ExchangeRequest>()

        fun storeExchangeRequest(exchangeRequest: ExchangeRequest) {
            exchangeRequests.add(exchangeRequest)
        }

        fun retrieveExchangeRequests(): List<ExchangeRequest> {
            return exchangeRequests
        }
    }
}