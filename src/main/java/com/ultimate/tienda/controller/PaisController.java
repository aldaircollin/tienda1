package com.ultimate.tienda.controller;

import com.ultimate.tienda.entity.Pais;
import com.ultimate.tienda.service.IPaisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    IPaisService paisService;

    @GetMapping
    public ResponseEntity<List<Pais>>listar(){
        List<Pais> obj = paisService.listar();
        return new ResponseEntity<List<Pais>>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pais>registrar(@RequestBody Pais pais){
        Pais obj = paisService.registrar(pais);
        return new ResponseEntity<Pais>(obj,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Pais>actualizar(@RequestBody Pais pais){
        Pais obj = paisService.actualizar(pais);
        return new ResponseEntity<Pais>(obj,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>eliminar(@PathVariable("id") Integer id) throws Exception{
        Pais obj = paisService.ListarPorId(id);
        if(obj==null){
            throw new Exception("No se Encontro el Id");
        }
        paisService.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pais>listarPorId(@PathVariable("id") Integer codigo) throws Exception {
        Pais obj = paisService.ListarPorId(codigo);
        if(obj==null){
            throw new Exception("No se Encontro el Id");
        }
        return new ResponseEntity<Pais>(obj, HttpStatus.OK);
    }

}
