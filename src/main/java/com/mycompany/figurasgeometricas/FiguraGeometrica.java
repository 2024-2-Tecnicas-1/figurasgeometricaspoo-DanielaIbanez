/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Lenovo
 */
// Complejidad temporal : (1) Tiempo constante
public class FiguraGeometrica {
    private String nombre;
    private String color;
    public FiguraGeometrica (String nombre, String color){
    this.color = color;
    this.nombre = nombre;
    
    }
    public String getNombre(){
    return nombre;
    }
    public String getColor(){
    return color;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public void setColor (String color){
    this.color = color;
    }
    public double obtenerArea(){
    return 0;
    }
    public double obtenerPerimetro(){
    return 0;
    }
    
}
