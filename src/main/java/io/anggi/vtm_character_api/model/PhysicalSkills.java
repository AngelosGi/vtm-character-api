package io.anggi.vtm_character_api.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class PhysicalSkills {
    private Integer athletics;
    private Integer brawl;
    private Integer craft;
    private Integer drive;
    private Integer firearms;
    private Integer larceny;
    private Integer melee;
    private Integer stealth;
    private Integer survival;
}