package io.anggi.vtm_character_api.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class MentalAttributes {
    private Integer intelligence;
    private Integer wits;
    private Integer resolve;
}