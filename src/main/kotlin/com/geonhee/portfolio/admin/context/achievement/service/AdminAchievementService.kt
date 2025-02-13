package com.geonhee.portfolio.admin.context.achievement.service

import com.geonhee.portfolio.admin.data.TableDTO
import com.geonhee.portfolio.domain.entity.Achievement
import com.geonhee.portfolio.domain.repository.AchievementRepository
import org.springframework.stereotype.Service

@Service
class AdminAchievementService(
    private val achievementRepository: AchievementRepository
) {

    fun getAchievementTable(): TableDTO {
        val classInfo = Achievement::class
        val entities = achievementRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

}