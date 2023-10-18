/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.java.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author facuq
 */
@Entity
public class Properties {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2 ")
    private Long id;
    private String address;
    private Boolean garage;
    private Integer rooms;
    private Integer environments;
    private String m2;
    private String description;

    public Properties() {
    }

    public Properties(Long id, String address, Boolean garage, Integer rooms, Integer environments, String m2, String description) {
        this.id = id;
        this.address = address;
        this.garage = garage;
        this.rooms = rooms;
        this.environments = environments;
        this.m2 = m2;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getGarage() {
        return garage;
    }

    public void setGarage(Boolean garage) {
        this.garage = garage;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getEnvironments() {
        return environments;
    }

    public void setEnvironments(Integer environments) {
        this.environments = environments;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
