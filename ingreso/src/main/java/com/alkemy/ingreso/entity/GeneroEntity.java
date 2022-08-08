
// GENERO ENTITY

package com.alkemy.ingreso.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "genero")
public class GeneroEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;    
    
    private String nombre;
    
    private String imagen;
    
    private String peliculas;   
    
}
