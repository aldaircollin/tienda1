package com.ultimate.tienda.service;

import com.ultimate.tienda.entity.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona>listar();
    Persona registrar(Persona persona);
    Persona actualizar(Persona persona);
    void eliminar(Integer codigo);
    Persona ListarPorId(Integer codigo);
}
