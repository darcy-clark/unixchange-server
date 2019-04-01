package com.unixchange.server.models

import java.util.Date

class ExchangeRequestReply(
        val user: User,
        val message: String,
        val timestamp: Date
)
