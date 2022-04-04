public class Vivienda {
    //atributos de la clase vivienda
    String color;
    int salas;
    int habitaciones;
    boolean terraza_azotea;
    boolean patio_jardin;
    boolean equipamiento;

    // metodo
    public static void main(String[]args){
        Vivienda vivienda1 = new Vivienda();

        vivienda1.color = "Blanco";
        vivienda1.salas = "6";
        vivienda1.habitaciones = "3";
        vivienda1.terraza_azotea = "no";
        vivienda1.patio_jardin = "si";
        vivienda1.equipamiento = "si";

        System.out.println("El color de la casa es: ");
        System.out.println("El numero de salas de la casa es:");
        System.out.println("El numero de habitaciones de la casa es:");
        System.out.println("¿La casa tiene terraza?:");
        System.out.println("¿La casa tiene jardin?:");
        System.out.println("¿La casa tieme equipamiento?:");
    }

}
