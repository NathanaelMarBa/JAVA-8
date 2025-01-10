package com.Nathanael.Martinez.Capitulo1.CreacionDeObjetos;

public class EjemploBloqueInicializador {

    public static void main(String[] args) {
        {
            System.out.println("Hola Mundo");
        }
    }

    {
        System.out.println("Bloque inicializador de instancia");
    }

    {
        System.out.println("Otro bloque inicializador de instancia");
    }
}
