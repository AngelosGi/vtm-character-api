package io.anggi.vtm_character_api.controller;

import io.anggi.vtm_character_api.dto.CharacterDTO;
import io.anggi.vtm_character_api.service.CharacterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@Tag(name = "Character", description = "Character management APIs")
public class CharacterController {
    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    @Operation(summary = "Create a new character", description = "Creates a new Vampire The Masquerade character")
    @ApiResponse(responseCode = "200", description = "Character created successfully")
    public ResponseEntity<CharacterDTO> createCharacter(@RequestBody CharacterDTO characterDTO) {
        return ResponseEntity.ok(characterService.createCharacter(characterDTO));
    }

    @GetMapping
    @Operation(summary = "Get all characters", description = "Retrieves a list of all Vampire The Masquerade characters")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of characters")
    public ResponseEntity<List<CharacterDTO>> getAllCharacters() {
        return ResponseEntity.ok(characterService.getAllCharacters());
    }



    @GetMapping("/{id}")
    @Operation(summary = "Get a character by ID", description = "Retrieves a Vampire The Masquerade character by their ID")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved the character")
    @ApiResponse(responseCode = "404", description = "Character not found")
    public ResponseEntity<CharacterDTO> getCharacterById(@PathVariable Long id) {
        return ResponseEntity.ok(characterService.getCharacter(id));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a character", description = "Updates an existing Vampire The Masquerade character")
    @ApiResponse(responseCode = "200", description = "Character updated successfully")
    @ApiResponse(responseCode = "404", description = "Character not found")
    public ResponseEntity<CharacterDTO> updateCharacter(@PathVariable Long id, @RequestBody CharacterDTO characterDTO) {
        return ResponseEntity.ok(characterService.updateCharacter(id, characterDTO));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a character", description = "Deletes a Vampire The Masquerade character")
    @ApiResponse(responseCode = "200", description = "Character deleted successfully")
    @ApiResponse(responseCode = "404", description = "Character not found")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return ResponseEntity.ok().build();
    }

    //add thymeleafe controler to display the character sheet.
}