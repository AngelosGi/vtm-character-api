package io.anggi.vtm_character_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TouchstoneConviction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String touchstone;
    private String conviction;

    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;
}