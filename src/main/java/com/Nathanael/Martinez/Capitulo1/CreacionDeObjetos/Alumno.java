package com.Nathanael.Martinez.Capitulo1.CreacionDeObjetos;

public class Alumno {

    private String nombre = "Yasmin";

    //Constructor
    public Alumno() {
        nombre = "Alexa";
        System.out.println("Ejecucion del constructor de Alumno");
    }

    //Metodo main
    public static void main(String[] args) {
        Alumno a = new Alumno();
        System.out.println(a.nombre);
    }

    //Bloque inicializador de instancia
    {
        System.out.println("Asignando variable");
        nombre = "Aly";
    }
}
