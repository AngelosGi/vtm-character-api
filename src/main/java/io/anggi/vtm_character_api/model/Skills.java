package io.anggi.vtm_character_api.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Embeddable
@Data
public class Skills {
    @Embedded
    private PhysicalSkills physical;

    @Embedded
    private SocialSkills social;

    @Embedded
    private MentalSkills mental;
}