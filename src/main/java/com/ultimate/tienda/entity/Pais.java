package com.ultimate.tienda.entity;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpais;

    @Column(name = "nombre",length = 50, nullable = false)
    private String nombre;

    public Pais() {
    }

    public Pais(Integer idpais, String nombre) {
        this.idpais = idpais;
        this.nombre = nombre;
    }

    public Integer getIdpais() {
        return idpais;
    }

    public void setIdpais(Integer idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
