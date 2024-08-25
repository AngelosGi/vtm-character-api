package io.anggi.vtm_character_api.dto;

import io.anggi.vtm_character_api.model.Enums.Clan;
import io.anggi.vtm_character_api.model.Enums.PredatorType;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CharacterDTO {
    private Long id;
    private String name;
    private String concept;
    private String sire;
    private String ambition;
    private String desire;
    private Clan clan;
    private PredatorType predatorType;
    private Integer generation;
    private AttributesDTO attributes;
    private SkillsDTO skills;
    private Map<String, Integer> disciplines;
    private Integer humanity;
    private Integer bloodPotency;
    private List<String> chronicleTenets;
    private List<TouchstoneConvictionDTO> touchstonesAndConvictions;
    private String clanBane;
    private Map<String, Integer> merits;
    private Map<String, Integer> flaws;
    private Map<String, Integer> backgrounds;
    private Integer experience;

    // Derived attributes
    private Integer health;
    private Integer willpower;
}