package io.anggi.vtm_character_api.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Embeddable
@Data
public class Attributes {
    @Embedded
    private PhysicalAttributes physical;

    @Embedded
    private SocialAttributes social;

    @Embedded
    private MentalAttributes mental;
}