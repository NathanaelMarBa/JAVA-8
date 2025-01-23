package com.Nathanael.Martinez.Capitulo2.OperadoresYSentencias;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int x1 = 1;
        short y1 = 2;

        boolean w1 = x1 > y1 & x1 < 10; // AND  --- false
        boolean w2 = x1 > y1 | x1 < 10; // OR --- true
        boolean w3 = x1 > y1 ^ x1 < 10; // XOR --- true

        // Operadores de corto circuito
        boolean w4 = true || y1 < 4; // OR
        boolean w5 = false && y1 < 4; // AND

        Integer o = Integer.valueOf(1);
        if(o != null && o.intValue() == 1) { } // Ecalua la segunda expresion solo cuando la primera es verdadera
        if(o != null & o.intValue() == 1) { } // Evalua ambas expresiones sin importar el resultado de la primera

        int x2 = 6;
        // La segunda expresion no se evalua porque se puede obtener el resultado solo
        // Evaluando la primer expresion
        boolean y2 = (x2 >= 6) || (++x2 <= 7);
        System.out.println(y2); // x2 es igual a 6

    }
}
