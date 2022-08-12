
// Personaje DTO

package com.alkemy.ingreso.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonajeDTO {
    
    private Long Id;
    
    private String imagen;
    
    private String nombre;
    
    private int edad;
    
    private double peso;
    
    private String historia;
    
}
