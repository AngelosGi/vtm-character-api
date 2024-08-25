package io.anggi.vtm_character_api.dto;

import lombok.Data;

@Data
public class AttributesDTO {
    private PhysicalAttributesDTO physical;
    private SocialAttributesDTO social;
    private MentalAttributesDTO mental;
}
