package io.anggi.vtm_character_api.model;
import io.anggi.vtm_character_api.model.Enums.PredatorType;
import io.anggi.vtm_character_api.model.Enums.Clan;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String concept;
    private String sire;
    private String ambition;
    private String desire;

    @Enumerated(EnumType.STRING)
    private Clan clan;

    @Enumerated(EnumType.STRING)
    private PredatorType predatorType;

    private Integer generation;

    @Embedded
    private Attributes attributes;

    @Embedded
    private Skills skills;

    @ElementCollection
    @CollectionTable(name = "character_disciplines")
    @MapKeyColumn(name = "discipline_name")
    @Column(name = "discipline_level")
    private Map<String, Integer> disciplines;

    private Integer humanity;
    private Integer bloodPotency;

    @ElementCollection
    @CollectionTable(name = "character_chronicle_tenets")
    @Column(name = "tenet")
    private List<String> chronicleTenets;

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TouchstoneConviction> touchstonesAndConvictions;

    private String clanBane;

    @ElementCollection
    @CollectionTable(name = "character_merits")
    @MapKeyColumn(name = "merit_name")
    @Column(name = "merit_level")
    private Map<String, Integer> merits;

    @ElementCollection
    @CollectionTable(name = "character_flaws")
    @MapKeyColumn(name = "flaw_name")
    @Column(name = "flaw_level")
    private Map<String, Integer> flaws;

    @ElementCollection
    @CollectionTable(name = "character_backgrounds")
    @MapKeyColumn(name = "background_name")
    @Column(name = "background_level")
    private Map<String, Integer> backgrounds;

    private Integer experience;

    // Derived attributes
    public Integer getHealth() {
        return attributes.getPhysical().getStamina() + 3;
    }

    public Integer getWillpower() {
        return attributes.getSocial().getComposure() + attributes.getMental().getResolve();
    }
}