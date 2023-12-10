package com.pius.localdatetutorial.clients.testclient

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

data class ClientResponseDto(
    @JsonFormat(pattern = "yyyyMMdd")
    val date: LocalDate
)
