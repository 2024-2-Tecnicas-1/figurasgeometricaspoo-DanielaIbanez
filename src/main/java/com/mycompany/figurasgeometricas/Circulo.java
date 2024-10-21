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
public class Circulo extends FiguraGeometrica {
    private double radio;
    
    public Circulo(String nombre, String color,double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    public double obtenerArea(){
        return Math.PI* radio * radio; 
    }
    public double obtenerPerimetro(){
    return 2* Math.PI * radio;
    }
    public double getRadio(){
    return radio;
    }
    
    public void setRadio(double radio){
    this.radio = radio;
    }
    
}
