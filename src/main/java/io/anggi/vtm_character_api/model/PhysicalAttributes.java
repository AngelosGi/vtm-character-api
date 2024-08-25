package io.anggi.vtm_character_api.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class PhysicalAttributes {
    private Integer strength;
    private Integer dexterity;
    private Integer stamina;
}