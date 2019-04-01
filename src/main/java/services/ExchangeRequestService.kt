package com.unixchange.server.services

import com.unixchange.server.MockDB
import com.unixchange.server.models.ExchangeRequest

class ExchangeRequestService {

    companion object {

        fun storeExchangeRequest(exchangeRequest: ExchangeRequest) {
            MockDB.storeExchangeRequest(exchangeRequest)
        }

        fun retrieveExchangeRequests(): List<ExchangeRequest> {
            return MockDB.retrieveExchangeRequests()
        }
    }
}
