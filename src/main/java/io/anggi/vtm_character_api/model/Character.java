package io.anggi.vtm_character_api.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Clan clan;

    private Integer generation;

    private Integer bloodPotency;
}