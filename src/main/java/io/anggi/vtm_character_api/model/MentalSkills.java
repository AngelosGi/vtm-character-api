package io.anggi.vtm_character_api.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class MentalSkills {
    private Integer academics;
    private Integer awareness;
    private Integer finance;
    private Integer investigation;
    private Integer medicine;
    private Integer occult;
    private Integer politics;
    private Integer science;
    private Integer technology;
}