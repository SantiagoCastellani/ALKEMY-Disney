
// Pelicula DTO

package com.alkemy.ingreso.dto;

import com.alkemy.ingreso.entity.PersonajeEntity;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeliculaDTO {
    
    private Long Id;
    
    private String imagen;
    
    private String titulo;
    
    private LocalDate fechaCreacion;
    
    private int calificacion;
    
    private List<PersonajeEntity> personajes;
    
    private Long generoId;    
    
}
