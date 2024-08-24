package io.anggi.vtm_character_api.dto;

import io.anggi.vtm_character_api.model.Clan;
import lombok.Data;

@Data
public class CharacterDTO {
    private Long id;
    private String name;
    private Clan clan;
    private Integer generation;
    private Integer bloodPotency;
}