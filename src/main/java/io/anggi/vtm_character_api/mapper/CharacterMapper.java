package io.anggi.vtm_character_api.mapper;

import io.anggi.vtm_character_api.dto.*;
import io.anggi.vtm_character_api.model.*;
import io.anggi.vtm_character_api.model.Character;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.AfterMapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    @Mapping(target = "health", ignore = true)
    @Mapping(target = "willpower", ignore = true)
    CharacterDTO toDTO(Character character);

    @AfterMapping
    default void calculateDerivedAttributes(Character character, @MappingTarget CharacterDTO characterDTO) {
        // Calculate health
        characterDTO.setHealth(character.getAttributes().getPhysical().getStamina() + 3);

        // Calculate willpower
        characterDTO.setWillpower(
                character.getAttributes().getSocial().getComposure() +
                        character.getAttributes().getMental().getResolve()
        );
    }

    Character toEntity(CharacterDTO characterDTO);

    AttributesDTO attributesToDTO(Attributes attributes);
    Attributes attributesToEntity(AttributesDTO attributesDTO);

    SkillsDTO skillsToDTO(Skills skills);
    Skills skillsToEntity(SkillsDTO skillsDTO);

    TouchstoneConvictionDTO touchstoneConvictionToDTO(TouchstoneConviction touchstoneConviction);
    TouchstoneConviction touchstoneConvictionToEntity(TouchstoneConvictionDTO touchstoneConvictionDTO);

    List<TouchstoneConvictionDTO> touchstoneConvictionListToDTO(List<TouchstoneConviction> touchstoneConvictions);
    List<TouchstoneConviction> touchstoneConvictionListToEntity(List<TouchstoneConvictionDTO> touchstoneConvictionDTOs);
}