package com.geonhee.portfolio.admin.interceptor

import org.springframework.data.domain.jaxb.SpringDataJaxb.PageDto

data class MenuDTO(
    val name: String,
    val pages: List<PageDto>
)