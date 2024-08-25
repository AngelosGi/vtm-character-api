package io.anggi.vtm_character_api.service;

import io.anggi.vtm_character_api.dto.CharacterDTO;
import io.anggi.vtm_character_api.mapper.CharacterMapper;
import io.anggi.vtm_character_api.model.Character;
import io.anggi.vtm_character_api.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    @Autowired
    public CharacterService(CharacterRepository characterRepository, CharacterMapper characterMapper) {
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;
    }

    public CharacterDTO createCharacter(CharacterDTO characterDTO) {
        Character character = characterMapper.toEntity(characterDTO);
        character = characterRepository.save(character);
        return characterMapper.toDTO(character);
    }

    public List<CharacterDTO> getAllCharacters() {
        return characterRepository.findAll().stream()
                .map(characterMapper::toDTO)
                .collect(Collectors.toList());
    }

    public CharacterDTO getCharacter(Long id) {
        return characterRepository.findById(id)
                .map(characterMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Character not found"));
    }

    public CharacterDTO updateCharacter(Long id, CharacterDTO characterDTO) {
        Character character = characterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Character not found"));

        // Update all fields
        Character updatedCharacter = characterMapper.toEntity(characterDTO);
        updatedCharacter.setId(id); // Ensure the ID is not changed

        updatedCharacter = characterRepository.save(updatedCharacter);
        return characterMapper.toDTO(updatedCharacter);
    }

    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }
}