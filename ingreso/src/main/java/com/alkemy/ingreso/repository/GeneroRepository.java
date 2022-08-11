
// Genero Repository

package com.alkemy.ingreso.repository;

import com.alkemy.ingreso.entity.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity,Long>{
    
}
