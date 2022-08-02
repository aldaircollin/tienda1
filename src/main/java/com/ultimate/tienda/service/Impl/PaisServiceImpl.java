package com.ultimate.tienda.service.Impl;

import com.ultimate.tienda.dao.IPaisDao;
import com.ultimate.tienda.entity.Pais;
import com.ultimate.tienda.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaisServiceImpl implements IPaisService {
    @Autowired
    IPaisDao paisDao;

    @Override
    public List<Pais> listar() {
        return paisDao.findAll();
    }

    @Override
    public Pais registrar(Pais pais) {
        return paisDao.save(pais);
    }

    @Override
    public Pais actualizar(Pais pais) {
        return paisDao.save(pais);
    }

    @Override
    public void eliminar(Integer codigo) {
    paisDao.deleteById(codigo);
    }

    @Override
    public Pais ListarPorId(Integer codigo) {
        return paisDao.findById(codigo).orElse(null);
    }
}
