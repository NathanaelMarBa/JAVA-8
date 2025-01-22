package com.Nathanael.Martinez.Capitulo2.OperadoresYSentencias;

public class OperadoresUnarios {

    public static void main(String[] args) {

        boolean a = !true;
        boolean b = false;
        System.out.println(a); // false
        System.out.println(b); // false

        b = !b;
        System.out.println(b); // true

        double d = +1.5; //Es lo mismo que -> double d = 1.5;
        double d1 = -2.5;
        System.out.println(d); // 1.5

        d = -d;
        System.out.println(d); // -1.5

        d = -d;
        System.out.println(d); // 1.5

        d = +d;
        System.out.println(d); //1.5

        d1 = +d1; // No modifica la variable.
        System.out.println(d1); /// -2.5

        //Ejemplos de mal uso de operadores
        boolean b1 = false;
        //b1 = -b1; //No compila
        //b1 = -true //No compila
        //int c1 = !0; //No compila

        //Operadores de incremento y decremento
        System.out.println("ejemplo de operadores de incremento y decremento");
        int contador = 0;
        System.out.println(contador);
        System.out.println(++contador);
        System.out.println(contador);
        System.out.println(contador--);
        System.out.println(contador);

        int m = 4;
        int n = 3;
        int x9 = ++m + --n * m++ / --n;

        //Siguiendo la regla, evalua todos los unary operators al mismo nivel y luego continua con las operaciones
        // 5 + 2 * 5 / 1 = 15

        System.out.println("x9: " + x9);
        System.out.println("m: " + m);

        int test = 0;

        if (test++ == 0){
            System.out.println("test: " + test);
        }

        int test2 = 0;

        if (++test2 == 0){
            System.out.println("test2: " + test2);
        }


    }
}
