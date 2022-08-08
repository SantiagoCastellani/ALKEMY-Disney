
// PERSONAJE ENTITY

package com.alkemy.ingreso.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
@Table(name = "personaje")   
public class PersonajeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    
    private String imagen;
    
    private String nombre;
    
    private int edad;
    
    private double peso;
    
    private String historia;
    
    @ManyToMany(mappedBy="personajes", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas = new ArrayList<>();
    
}
