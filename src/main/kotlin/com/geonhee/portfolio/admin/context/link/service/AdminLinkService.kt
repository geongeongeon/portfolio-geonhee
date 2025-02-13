package com.geonhee.portfolio.admin.context.link.service

import com.geonhee.portfolio.admin.data.TableDTO
import com.geonhee.portfolio.domain.entity.Achievement
import com.geonhee.portfolio.domain.entity.Introduction
import com.geonhee.portfolio.domain.entity.Link
import com.geonhee.portfolio.domain.repository.IntroductionRepository
import com.geonhee.portfolio.domain.repository.LinkRepository
import org.springframework.stereotype.Service

@Service
class AdminLinkService(
    private val linkRepository: LinkRepository
) {

    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

}