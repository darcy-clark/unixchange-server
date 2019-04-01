package com.unixchange.server.enums

import com.fasterxml.jackson.annotation.JsonProperty

enum class CurrencyType {

    @JsonProperty("CAD")
    CAD,
    @JsonProperty("USD")
    USD,
    @JsonProperty("EUR")
    EUR
}