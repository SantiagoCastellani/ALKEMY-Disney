
// GENERO Service

package com.alkemy.ingreso.service;

import com.alkemy.ingreso.dto.GeneroDTO;
import java.util.List;



public interface GeneroService {
    
    GeneroDTO save(GeneroDTO dto);
    
    List<GeneroDTO> getAllGeneros();
    
}
