package com.ultimate.tienda.dao;

import com.ultimate.tienda.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Integer> {

}
