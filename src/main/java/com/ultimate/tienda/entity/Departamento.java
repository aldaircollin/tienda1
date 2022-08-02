package com.ultimate.tienda.entity;

import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddepartamento;

    @Column(name = "nombre",length = 50, nullable = false)
    private String nombre;

    @Column(name = "codigo",length = 50, nullable = false)
    private String codigo;


    public Departamento() {
    }

    public Departamento(Integer iddepartamento, String nombre, String codigo) {
        this.iddepartamento = iddepartamento;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Integer getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Integer iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
