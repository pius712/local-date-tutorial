package com.pius.localdatetutorial.controller.request

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

data class TestLocalDateRequestDto(
     @JsonFormat(pattern = "yyyyMMdd")
     val startDate: LocalDate
) {
}