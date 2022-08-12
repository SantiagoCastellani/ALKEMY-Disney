
// PeliculaService Implementación

package com.alkemy.ingreso.service.impl;

import com.alkemy.ingreso.dto.PeliculaDTO;
import com.alkemy.ingreso.entity.PeliculaEntity;
import com.alkemy.ingreso.mapper.PeliculaMapper;
import com.alkemy.ingreso.repository.PeliculaRepository;
import com.alkemy.ingreso.service.PeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl implements PeliculaService{
    
    @Autowired
    private PeliculaMapper peliculaMapper;
    @Autowired
    private PeliculaRepository peliculaRepository;
    
    public PeliculaDTO save(PeliculaDTO dto) {
        PeliculaEntity entity = peliculaMapper.peliculaDTO2Entity(dto);
        PeliculaEntity entitySaved = peliculaRepository.save(entity);
        PeliculaDTO result = peliculaMapper.peliculaEntity2DTO(entitySaved);
        return result;       
    }

    public List<PeliculaDTO> getAllPeliculas() {
        List<PeliculaEntity> entities = peliculaRepository.findAll();
        List<PeliculaDTO> result = peliculaMapper.peliculaEntityList2DTOList(entities);
        return result;        
    }    
    
}
