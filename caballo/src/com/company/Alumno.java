package com.company;

public class Alumno {
    String nombre;
    String apellidos;
    String direccion;

    //metodo
    public static void main (String[]args){
        Alumno alumno1 =new Alumno();

        alumno1.nombre = "Jose Ramon";
        alumno1.apellidos = "Da Costa Mariño";
        alumno1.direccion = "Calle  Palmera Canaria Nº9";

        System.out.println("El nombre del alumno es " + alumno1.nombre);
        System.out.println("Los aellidos del alumno son " + alumno1.apellidos);
        System.out.println("LA dirección del alumno es " + alumno1.direccion);
    }
}
