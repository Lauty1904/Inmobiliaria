
package com.proyect.java.entity;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import org.hibernate.annotations.GenericGenerator;




@Entity
public class Image {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2" )
    private String id;
    
    @Lob @Basic(fetch = FetchType.LAZY)
    private Byte[] contenido;
    
    private String name;
    private String mime;

    public Image() {
    }

    public Image(String id, Byte[] contenido, String name, String mime) {
        this.id = id;
        this.contenido = contenido;
        this.name = name;
        this.mime = mime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Byte[] getContenido() {
        return contenido;
    }

    public void setContenido(Byte[] contenido) {
        this.contenido = contenido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }
    
    
}
