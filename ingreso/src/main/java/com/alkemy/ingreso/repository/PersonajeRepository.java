
// Personaje Repository

package com.alkemy.ingreso.repository;

import com.alkemy.ingreso.entity.PersonajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository <PersonajeEntity,Long> {
    
}
