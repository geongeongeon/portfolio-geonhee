package com.geonhee.portfolio.admin.context.introduction.service

import com.geonhee.portfolio.admin.data.TableDTO
import com.geonhee.portfolio.domain.entity.Achievement
import com.geonhee.portfolio.domain.entity.Introduction
import com.geonhee.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {

    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

}