package com.ultimate.tienda.dao;

import com.ultimate.tienda.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaisDao extends JpaRepository<Pais,Integer> {
}
