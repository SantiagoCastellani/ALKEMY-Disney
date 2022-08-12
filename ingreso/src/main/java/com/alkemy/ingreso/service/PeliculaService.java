
// PELICULA Service

package com.alkemy.ingreso.service;

import com.alkemy.ingreso.dto.PeliculaDTO;
import java.util.List;


public interface PeliculaService {
    
    PeliculaDTO save(PeliculaDTO dto);
    
    List<PeliculaDTO> getAllPeliculas();
    
}
