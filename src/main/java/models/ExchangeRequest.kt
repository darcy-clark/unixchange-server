package com.unixchange.server.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonFormat
import com.unixchange.server.enums.CurrencyType
import com.unixchange.server.enums.ExchangeRequestType
import java.util.Date

class ExchangeRequest @JsonCreator constructor(
        val buyCurrency: CurrencyType,
        val sellCurrency: CurrencyType,
        val type: ExchangeRequestType,
        val amount: Float,
        val replies: List<ExchangeRequestReply>,
        val user: User,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
        val reqDate: Date
)
