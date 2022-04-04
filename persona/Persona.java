import org.w3c.dom.ls.LSOutput;

public class Persona {
    //atributos
    public int imc (int altura, int peso){
        int imc = peso/(altura*altura);
        return imc;


        System.out.println("El indice de masa corporal es " + );

    }


    int edad;
    int dni;
    float peso;
    float altura;


    public static void main(int[] args) {

        Persona persona1 = new Persona();

        persona1.edad = Integer.parseInt("");
        persona1.dni = Integer.parseInt("");
        persona1.peso = Float.parseFloat("");
        persona1.altura = Float.parseFloat("");

        System.out.println("La edad de " + persona1.nombre + "es" + persona1.edad);
        System.out.println("Su DNI es " + persona1.dni);
        System.out.println("Su peso es " + persona1.peso);
        System.out.println("Su altura es " + persona1.altura);

    }

    String nombre;
    String sexo;
    String estadi_civil;
    String coche;


    public static void main(String[]args){
        Persona persona1 = new Persona();

        persona1.nombre = ("");
        persona1.sexo = ("");
        persona1.estadi_civil = ("");
        persona1.coche = ("");




        System.out.println("Su nombre es " + persona1.nombre);
        System.out.println("El sexo de " + persona1.nombre + "es" + persona1.sexo);
        System.out.println("Su estado civil es " + persona1.estadi_civil);
        System.out.println("El coche de " + persona1.nombre + "es" + persona1.coche);


    }
}
