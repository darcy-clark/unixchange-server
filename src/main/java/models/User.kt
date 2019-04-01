package com.unixchange.server.models

import com.fasterxml.jackson.annotation.JsonCreator

data class User @JsonCreator constructor(
        val username: String)
