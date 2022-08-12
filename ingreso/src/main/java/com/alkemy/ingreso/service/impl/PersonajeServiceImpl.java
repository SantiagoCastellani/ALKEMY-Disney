
// PersonajeService Implementación

package com.alkemy.ingreso.service.impl;

import com.alkemy.ingreso.dto.PersonajeDTO;
import com.alkemy.ingreso.entity.PersonajeEntity;
import com.alkemy.ingreso.mapper.PersonajeMapper;
import com.alkemy.ingreso.repository.PersonajeRepository;
import com.alkemy.ingreso.service.PersonajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImpl implements PersonajeService{
    
    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;
    
    public PersonajeDTO save(PersonajeDTO dto) {
        PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity entitySaved = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntity2DTO(entitySaved);
        return result;       
    }

    public List<PersonajeDTO> getAllPersonajes() {
        List<PersonajeEntity> entities = personajeRepository.findAll();
        List<PersonajeDTO> result = personajeMapper.personajeEntityList2DTOList(entities);
        return result;        
    }
    
    
}
