package com.ultimate.tienda.entity;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpersona;

    @Column(name = "nombres",length = 50, nullable = false)
    private String nombres;

    @Column(name = "apellidos",length = 50, nullable = false)
    private String apellidos;

    @Column(name = "edad")
    private Integer edad;

    @ManyToOne
    @JoinColumn(name = "idpais")
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "iddepartamento")
    private Departamento departamento;

    public Persona() {
    }

    public Persona(Integer idpersona, String nombres, String apellidos, Integer edad, Pais pais, Departamento departamento) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
        this.departamento = departamento;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
