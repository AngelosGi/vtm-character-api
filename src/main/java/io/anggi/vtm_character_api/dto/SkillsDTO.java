package io.anggi.vtm_character_api.dto;

import lombok.Data;

@Data
public class SkillsDTO {
    private PhysicalSkillsDTO physical;
    private SocialSkillsDTO social;
    private MentalSkillsDTO mental;
}