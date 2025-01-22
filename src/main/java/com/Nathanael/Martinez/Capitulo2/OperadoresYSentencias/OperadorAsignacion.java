package com.Nathanael.Martinez.Capitulo2.OperadoresYSentencias;

public class OperadorAsignacion {

    public static void main(String[] args) {
        //   EJEMPLOS DE ASIGNACION   \\

        //No compilan

        /*int = 1.0;
        short y = 3276; //Valor maximo de short 32767
        int z = 9F;
        long t = 123445567575897;
        long t = (long) 123445567575897;*/

        //Si compilan
        int x = (int) 1.9;
        short y = (short) 192122; //Almacenando como 20678 //Valor maximo short 23767
        int z = (int) 9f;
        long t = 123445567575897L;


        //   EJEMPLOS DE PROMOCION NUMERICA DE CHAR, BYTE, SHORT A INT AUTOMATICAMENTE   \\\

        short x1 = 10;
        short y1 = 3;
        //short z = x1 * y1; // No compila
        //short z2 = (short) x1 * y1; // No compila
        short z3 = (short) (x1 * y1);

        byte w = 1;
        char w1 = 'c';
        //short w3 = w + w1; //No compila
        int w4 = w + w1;
        short w5 = (short) (w + w1);

        System.out.println((char) ('a' + 1));


    }
}
