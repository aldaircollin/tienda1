package com.ultimate.tienda.service.Impl;

import com.ultimate.tienda.dao.IPersonaDao;
import com.ultimate.tienda.entity.Persona;
import com.ultimate.tienda.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    IPersonaDao personaDao;

    @Override
    public List<Persona> listar() {
        return personaDao.findAll();
    }

    @Override
    public Persona registrar(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    public void eliminar(Integer codigo) {
    personaDao.deleteById(codigo);
    }

    @Override
    public Persona ListarPorId(Integer codigo) {
        return personaDao.findById(codigo).orElse(null);
    }
}
