package com.Nathanael.Martinez.Capitulo2.OperadoresYSentencias;

public class OperadorRelacional {

    public static void main(String[] args) {
        int x = 5;
        Long y = 2L;
        y = null; // Si el valor es nulo puede haber una excepcion en tiempo de ejecucion
        if (x > y) {}
        if (x < y) {}
        if (x >= y) {}
        if (x <= y) {}

        //if (" " <= y) {} //Este tipo de situaciones ni siquiera compilan

        Number p = Integer.valueOf(1);

        if (p instanceof Integer) { //Se evalua el tipo de instancia en la referencia de P
            System.out.println("p instance of Integer");
        }

        if (p instanceof Double) {
            System.out.println("p instance of Double");
        }
    }
}
