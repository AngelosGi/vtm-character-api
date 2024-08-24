package io.anggi.vtm_character_api.repository;

import io.anggi.vtm_character_api.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}