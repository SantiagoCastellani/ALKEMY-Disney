
// PERSONAJE Service

package com.alkemy.ingreso.service;

import com.alkemy.ingreso.dto.PersonajeDTO;
import java.util.List;


public interface PersonajeService {
    
    PersonajeDTO save(PersonajeDTO dto);
    
    List<PersonajeDTO> getAllPersonajes();
    
}
