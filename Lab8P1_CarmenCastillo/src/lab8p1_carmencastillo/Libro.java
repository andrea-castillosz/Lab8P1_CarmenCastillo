/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_carmencastillo;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author casti
 */

public class Libro {
    
    private String titulo;
    private String nombre;
    private int publicacion;
    
    public Libro(){
        
        
    }
    
    public Libro(String tituloN, String nombreN, int publicacionN){
        
        this.titulo = tituloN;
        this.nombre = nombreN;
        this.publicacion = publicacionN;
        
    }
    
    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }
    
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }
    
    public void setPublicacion(int pub) {

        this.publicacion = pub;

    }
    
    public String getTitulo(){
        return this.titulo;
        
    }
    
    public String getNombre(){
        return this.nombre;
        
    }
    
    public int getPublicacion(){
        return this.publicacion;
        
    }
    
    
    
    
    
    
}
