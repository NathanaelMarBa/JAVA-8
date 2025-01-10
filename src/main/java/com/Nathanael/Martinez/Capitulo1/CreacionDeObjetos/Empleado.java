package com.Nathanael.Martinez.Capitulo1.CreacionDeObjetos;

public class Empleado {

    //Constructor
    public Empleado(){
        System.out.println("Construccion de un objeto de tipo empleado");
    }

    //Metodo con el nombre del constructor
    public void Empleado(){
        System.out.println("Metodo de la clase de empleado");
    }

    public static void main(String[] args) {
        //Creacion de un objeto de Empleado
        Empleado emp = new Empleado();
    }
}
