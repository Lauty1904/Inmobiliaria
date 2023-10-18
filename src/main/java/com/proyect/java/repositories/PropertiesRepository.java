/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.java.repositories;

import com.proyect.java.entidades.Properties;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

/**
 *
 * @author facuq
 */

@Repository
public interface PropertiesRepository extends JpaRepository<Properties, Long> { 
    
    @Query("SELECT p FROM Properties p WHERE p.address = :address")
     public Properties searchForAddress(@Param("address") String address);
     
    @Query("SELECT p FROM Properties p WHERE p.garage = : garage")
    public List<Properties> searchForGarage(@Param ("garage") Boolean garage);
}
