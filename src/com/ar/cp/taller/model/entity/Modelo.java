package com.ar.cp.taller.model.entity;
// Generated 19/07/2021 17:46:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Modelo generated by hbm2java
 */
@Entity
@Table(name="modelo"
    ,schema="public"
)
public class Modelo  implements java.io.Serializable {


     private int id;
     private Marca marca;
     private String descripcion;
     private String tipocombustible;
     private Integer anio;
     private Set<Vehiculo> vehiculos = new HashSet<Vehiculo>(0);

    public Modelo() {
    }

	
    public Modelo(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    public Modelo(int id, Marca marca, String descripcion, String tipocombustible, Integer anio, Set<Vehiculo> vehiculos) {
       this.id = id;
       this.marca = marca;
       this.descripcion = descripcion;
       this.tipocombustible = tipocombustible;
       this.anio = anio;
       this.vehiculos = vehiculos;
    }
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="marcaid")
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    
    @Column(name="descripcion", nullable=false)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="tipocombustible", length=100)
    public String getTipocombustible() {
        return this.tipocombustible;
    }
    
    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    
    @Column(name="anio")
    public Integer getAnio() {
        return this.anio;
    }
    
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="modelo")
    public Set<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Set<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }




}


