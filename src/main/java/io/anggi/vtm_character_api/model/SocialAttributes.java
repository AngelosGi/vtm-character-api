package io.anggi.vtm_character_api.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class SocialAttributes {
    private Integer charisma;
    private Integer manipulation;
    private Integer composure;
}