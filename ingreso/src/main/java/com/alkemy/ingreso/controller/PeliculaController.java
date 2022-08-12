
// PELICULA Controller

package com.alkemy.ingreso.controller;

import com.alkemy.ingreso.dto.PeliculaDTO;
import com.alkemy.ingreso.service.PeliculaService;
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
@RequestMapping("peliculas")
@CrossOrigin(origins="*")
public class PeliculaController {
    
    @Autowired
    private PeliculaService peliculaService;
    
    @GetMapping
    public ResponseEntity<List<PeliculaDTO>> getAll(){
        List<PeliculaDTO> peliculas = peliculaService.getAllPeliculas();
        return ResponseEntity.ok().body(peliculas);
    }
    
    @PostMapping
    public ResponseEntity<PeliculaDTO> save(@RequestBody PeliculaDTO pelicula){
        PeliculaDTO peliculaGuardada = peliculaService.save(pelicula);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardada);
    }
   
}
    

