package com.company;

public class Pizza {
    private final String pedid;
    private String servid;
    //apributos pizza
    String tamaño;
    String tipo;
    String estado;
    int servida;
    int pedida;

    public Pizza(Object margarita, String mediana) {

    }

    public Pizza() {
        pizza1.tamaño = "mediana";
        pizza1.tipo = "margarita";
        pizza1.estado = "servida";
        pizza1.servid = "1";
        pizza1.pedid = "1";
    }

    //metodos
        public String tamaño(String mediana, String familiar) {
        String tamaño1 = mediana;
        String tamaño2 = familiar;
        return tamaño;
    }
        public String tipo (String margarita, String cuatro_quesos, String funghi) {
        String tipo1 = margarita;
        String tipo2 = cuatro_quesos;
        String tipo3 = funghi;
        return tipo;
        }
        public String estado(String servida) {
        String estado1 = pedida;
        String estado2 = servida;
        return estado;
        }
        public int servida (int servida){
        int servida = "pizzas servidas" + servida;
        return servida;
        }
        Pizza pizza1 = new Pizza();
        public void mostrarResultados(){

            System.out.println("El tipo de pizza es" + tipo);
            System.out.println("El tamaño de la pizza es " + tamaño);
            System.out.println("El estado es " + estado);
    }


}
