package io.anggi.vtm_character_api.mapper;

import io.anggi.vtm_character_api.dto.CharacterDTO;
import io.anggi.vtm_character_api.model.Character;
import org.springframework.stereotype.Component;

@Component
public class CharacterMapper {
    public CharacterDTO toDTO(Character character) {
        CharacterDTO dto = new CharacterDTO();
        dto.setId(character.getId());
        dto.setName(character.getName());
        dto.setClan(character.getClan());
        dto.setGeneration(character.getGeneration());
        dto.setBloodPotency(character.getBloodPotency());
        return dto;
    }

    public Character toEntity(CharacterDTO dto) {
        Character character = new Character();
        character.setId(dto.getId());
        character.setName(dto.getName());
        character.setClan(dto.getClan());
        character.setGeneration(dto.getGeneration());
        character.setBloodPotency(dto.getBloodPotency());
        return character;
    }
}