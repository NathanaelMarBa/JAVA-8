package com.Nathanael.Martinez.Capitulo2.OperadoresYSentencias;

public class OperadoresDeAsignacionCompuesta {

    //int w9 += 2; //No compila
    int p1;
    {
        p1 += 2;
    }

    public static void main(String[] args) {
        int x = 2, z = 3;
        x = x * z; // Asignacion simple
        z *= z; // Asignacion compuesta (Equivalente al anterior)

        //int w += 2; // No compila
        int y ;
        //y += 2; // No compila

        //Casteo implicito
        long x1 = 10;
        int y1 = 5;
        y1 = y1 * (int) x1; //Si compila
        y1 *= x1; // Si compila
        //y1 = y1 * x1; // No compila

        int w = 1;
        char w1 = 'c';
        w1 += w; // Si compila

        // int m += 1; //No compila, el valor de m no esta inicializado

        //Operadores de asignacion sintacticamente right-associative (Se agrupan de derecha a izquierda).
        int abc = 10;
        int a1, b1, c1;
        a1 = b1 = c1 = abc;

        System.out.println("abc: " + abc + " a : " + b1 + " c1 : " + c1);

    }
}
