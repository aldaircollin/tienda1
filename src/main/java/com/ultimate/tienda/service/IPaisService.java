package com.ultimate.tienda.service;

import com.ultimate.tienda.entity.Pais;

import java.util.List;

public interface IPaisService {
    List<Pais> listar();
    Pais registrar(Pais pais);
    Pais actualizar(Pais pais);
    void eliminar(Integer codigo);
    Pais ListarPorId(Integer codigo);
}
