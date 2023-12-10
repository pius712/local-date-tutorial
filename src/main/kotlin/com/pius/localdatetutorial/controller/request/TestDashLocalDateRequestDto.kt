package com.pius.localdatetutorial.controller.request

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

data class TestDashLocalDateRequestDto(
    @JsonFormat(pattern = "yyyy-MM-dd")
    val date: LocalDate
)
