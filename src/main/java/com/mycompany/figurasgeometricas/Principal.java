package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese el nombre de la figura");
        String nombreFigura = scan.nextLine();
        System.out.println("Ingrese el color de la figura");
        String colorFigura = scan.nextLine();
        System.out.println("Ingrese el tipo de figura"+" 1: Circulo, 2: Rectangulo, 3: Triangulo ");
        String tipoFigura = scan.nextLine();
        switch (tipoFigura){
            case "1":
                System.out.println("Ingrese el radio del circulo");
                double radio= scan.nextDouble();
                Circulo circulo = new Circulo(nombreFigura,colorFigura,radio);
                System.out.println("Figura: "+ circulo.getNombre());
                System.out.println("Color: "+ circulo.getColor());
                System.out.println("Area: "+ circulo.obtenerArea());
                System.out.println("Perimetro: "+ circulo.obtenerPerimetro());
                break;
            case "2":
                System.out.println("Ingrese el valor del lado 1:");
                double lado1= scan.nextDouble();
                System.out.println("Ingrese el valor del lado 2:");
                double lado2= scan.nextDouble();
                Rectangulo rectangulo = new Rectangulo(nombreFigura,colorFigura,lado1,lado2);
                System.out.println("Figura: "+ rectangulo.getNombre());
                System.out.println("Color: "+ rectangulo.getColor());
                System.out.println("Area: "+ rectangulo.obtenerArea());
                System.out.println("Perimetro: "+ rectangulo.obtenerPerimetro());
                break;
            case "3":
                System.out.println("Ingrese la base:");
                double base = scan.nextDouble();
                System.out.println("Ingrese la altura:");
                double altura = scan.nextDouble();
                Triangulo triangulo = new Triangulo(nombreFigura,colorFigura,base,altura);
                System.out.println("Figura: "+ triangulo.getNombre());
                System.out.println("Color: "+ triangulo.getColor());
                System.out.println("Area: "+ triangulo.obtenerArea());
                System.out.println("Perimetro: "+ triangulo.obtenerPerimetro());
                break;
            default:
                System.out.println("Opción inválida");
                
        }
        // TODO: Tu código va aquí
    }
}
