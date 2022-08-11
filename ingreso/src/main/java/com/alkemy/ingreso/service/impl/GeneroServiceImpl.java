
// GeneroService Implementación

package com.alkemy.ingreso.service.impl;

import com.alkemy.ingreso.dto.GeneroDTO;
import com.alkemy.ingreso.entity.GeneroEntity;
import com.alkemy.ingreso.mapper.GeneroMapper;
import com.alkemy.ingreso.repository.GeneroRepository;
import com.alkemy.ingreso.service.GeneroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImpl implements GeneroService {
    
    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepository;
    
    @Override
    public GeneroDTO save(GeneroDTO dto) {
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        GeneroEntity entitySaved = generoRepository.save(entity);
        GeneroDTO result = generoMapper.generoEntity2DTO(entitySaved);
        return result;       
    }

    @Override
    public List<GeneroDTO> getAllGeneros() {
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.generoEntityList2DTOList(entities);
        return result;        
    }
    
    
    
}
