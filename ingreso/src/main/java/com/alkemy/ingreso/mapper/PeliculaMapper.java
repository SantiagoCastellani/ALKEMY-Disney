
// Pelicula MAPPER

package com.alkemy.ingreso.mapper;

import com.alkemy.ingreso.dto.PeliculaDTO;
import com.alkemy.ingreso.entity.PeliculaEntity;
import com.alkemy.ingreso.entity.PersonajeEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class PeliculaMapper {
    
    public PeliculaEntity peliculaDTO2Entity(PeliculaDTO dto){
        
        PeliculaEntity peliculaEntity = new PeliculaEntity();
        peliculaEntity.setImagen(dto.getImagen());
        peliculaEntity.setTitulo(dto.getTitulo());
        peliculaEntity.setFechaCreacion(dto.getFechaCreacion());
        peliculaEntity.setCalificacion(dto.getCalificacion());
        peliculaEntity.setPersonajes((Set<PersonajeEntity>) dto.getPersonajes());
        peliculaEntity.setGeneroId(dto.getGeneroId());
        return peliculaEntity;        
    }
    
    public PeliculaDTO peliculaEntity2DTO (PeliculaEntity entity){
        PeliculaDTO dto = new PeliculaDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setTitulo(entity.getTitulo());
        dto.setCalificacion(entity.getCalificacion());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setPersonajes((List<PersonajeEntity>) entity.getPersonajes());
        dto.setGeneroId(entity.getGeneroId());
        return dto;       
    }
    
    public List<PeliculaDTO> peliculaEntityList2DTOList (List<PeliculaEntity> entities){
        List<PeliculaDTO> dtos = new ArrayList<>();
        for (PeliculaEntity entity : entities) {
            dtos.add(this.peliculaEntity2DTO(entity));
        }
        return dtos;        
    }
       
        
}
