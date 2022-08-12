
// PERSONAJE Controller

package com.alkemy.ingreso.controller;

import com.alkemy.ingreso.dto.PersonajeDTO;
import com.alkemy.ingreso.service.PersonajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personajes")
@CrossOrigin(origins="*")
public class PersonajeController {
    
    @Autowired
    private PersonajeService personajeService;
    
    @GetMapping
    public ResponseEntity<List<PersonajeDTO>> getAll(){
        List<PersonajeDTO> personajes = personajeService.getAllPersonajes();
        return ResponseEntity.ok().body(personajes);
    }
    
    @PostMapping
    public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje){
        PersonajeDTO peliculaGuardada = personajeService.save(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardada);
    }
   
}