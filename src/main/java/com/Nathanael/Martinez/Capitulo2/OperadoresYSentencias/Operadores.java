package com.Nathanael.Martinez.Capitulo2.OperadoresYSentencias;

public class Operadores {

    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y;
        System.out.println(x); //9.0


        //Mismo nivel de precedencia se evalua de izquierda a derecha
        int p = 3 * 5 / 5 * 10;
        System.out.println(p); //30

        //Sobreescribir el orden utilizando parentesis
        p = 6 * 30 / (5 * 3);
        System.out.println(p); //2

        //Operadores aritmeticos binarios
        int x1 = 2 * 5 + 3 * 4 - 8;
        System.out.println(x1); //14

        //Cambiando el ordeen de precedencia utilizando parentesis
        x1 = 2 * ((5 + 3) * 4 - 8);
        System.out.println(x1); //48

        //Operador modulo
        int z = 10 % 2;
        System.out.println(z); //0
    }
}
