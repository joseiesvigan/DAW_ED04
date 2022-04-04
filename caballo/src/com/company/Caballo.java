package com.company;

public class Caballo {
    //atributos de un caballo
    String color;
    String raza;
    String tipo_de_pelaje;

    //metodo
    public static void main (String[]args) {
        Caballo caballo1 = new Caballo();

        caballo1.color = "negro";
        caballo1.raza = "pura raza español";
        caballo1.tipo_de_pelaje = "corto";

        System.out.println("El color del caballo es "+ caballo1.color);
        System.out.println("LA raza de caballo es "+ caballo1.raza);
        System.out.println("El caballo tiene el tipo de pelaje "+ caballo1.tipo_de_pelaje);

    }

}
