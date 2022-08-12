
// Personaje MAPPER

package com.alkemy.ingreso.mapper;

import com.alkemy.ingreso.dto.PersonajeDTO;
import com.alkemy.ingreso.entity.PersonajeEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonajeMapper {
    
    public PersonajeEntity personajeDTO2Entity(PersonajeDTO dto){
        
        PersonajeEntity personajeEntity = new PersonajeEntity();
        personajeEntity.setImagen(dto.getImagen());
        personajeEntity.setNombre(dto.getNombre());
        personajeEntity.setEdad(dto.getEdad());
        personajeEntity.setPeso(dto.getPeso());
        personajeEntity.setHistoria(dto.getHistoria());
        
        return personajeEntity;        
    }
    
    public PersonajeDTO personajeEntity2DTO (PersonajeEntity entity){
        PersonajeDTO dto = new PersonajeDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        dto.setEdad(entity.getEdad());
        dto.setPeso(entity.getPeso());
        dto.setHistoria(entity.getHistoria());
        return dto;       
    }
    
    public List<PersonajeDTO> personajeEntityList2DTOList (List<PersonajeEntity> entities){
        List<PersonajeDTO> dtos = new ArrayList<>();
        for (PersonajeEntity entity : entities) {
            dtos.add(this.personajeEntity2DTO(entity));
        }
        return dtos;        
    }
    
    
}