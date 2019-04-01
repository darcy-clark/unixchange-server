package com.unixchange.server.enums

import com.fasterxml.jackson.annotation.JsonProperty

enum class ExchangeRequestType {

    @JsonProperty("buy")
    BUY,
    @JsonProperty("sell")
    SELL
}
