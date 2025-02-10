package com.geonhee.portfolio.domain.repository

import com.geonhee.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>