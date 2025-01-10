package com.Nathanael.Martinez.Capitulo1.EstructuraDeLasClases;

/*
 * Es posible definir mas de una sola clase en un mismo archivo, teniendo como MAXIMO una clase PUBLICA por archivo
 *El nombre de la clase publica debe de coincidir con el archivo
 *
 * */

public class Persona { //Esta seria la clase publica equivalente al archivo, incluso podriamos tener sin problemas ninguna clase publica
    String nombre;

    public String getNombre() {
        return nombre;
    }
}

class Animal { //Clase extra contenida dentro del mismo archivo

}

class Libro { //Segunda clase extra contenida dentro del mismo archivo

}
