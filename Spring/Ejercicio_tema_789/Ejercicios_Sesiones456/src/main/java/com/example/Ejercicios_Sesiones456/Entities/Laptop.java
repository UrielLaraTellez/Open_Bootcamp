package com.example.Ejercicios_Sesiones456.Entities;


import javax.persistence.*;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Integer nucleos;
    private Integer memoria;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String modelo, Integer nucleos, Integer memoria) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.memoria = memoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getNucleos() {
        return nucleos;
    }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }
}
