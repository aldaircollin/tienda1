package com.ultimate.tienda.controller;

import com.ultimate.tienda.entity.Pais;
import com.ultimate.tienda.entity.Persona;
import com.ultimate.tienda.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping
    public ResponseEntity<List<Persona>> listar(){
        List<Persona> obj = personaService.listar();
        return new ResponseEntity<List<Persona>>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void>registrar(@RequestBody Persona persona){
        Persona obj = personaService.registrar(persona);
        URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdpersona()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public ResponseEntity<Persona>actualizar(@RequestBody Persona persona){
        Persona obj = personaService.actualizar(persona);
        return new ResponseEntity<Persona>(obj,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>eliminar(@PathVariable("id") Integer id) throws Exception{
        Persona obj = personaService.ListarPorId(id);
        if(obj==null){
            throw new Exception("No se Encontro el Id");
        }
        personaService.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona>listarPorId(@PathVariable("id") Integer codigo) throws Exception {
        Persona obj = personaService.ListarPorId(codigo);
        if(obj==null){
            throw new Exception("No se Encontro el Id");
        }
        return new ResponseEntity<Persona>(obj, HttpStatus.OK);
    }

}
