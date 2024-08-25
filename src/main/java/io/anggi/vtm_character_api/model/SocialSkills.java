package io.anggi.vtm_character_api.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class SocialSkills {
    private Integer animalKen;
    private Integer etiquette;
    private Integer insight;
    private Integer intimidation;
    private Integer leadership;
    private Integer performance;
    private Integer persuasion;
    private Integer streetwise;
    private Integer subterfuge;
}