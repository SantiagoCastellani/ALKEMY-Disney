
// Pelicula Repository

package com.alkemy.ingreso.repository;

import com.alkemy.ingreso.entity.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity,Long>{
    
}
