package com.geonhee.portfolio.domain.repository

import com.geonhee.portfolio.domain.entity.Account
import com.geonhee.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface AccountRepository : JpaRepository<Account, Long> {

    fun findByLoginId(loginId: String): Optional<Account>

}