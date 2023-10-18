
package com.proyect.java.repository;

import com.proyect.java.entity.Image;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ImageRepository extends JpaRepository<Image, String>{
    
}
