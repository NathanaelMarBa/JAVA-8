package com.Nathanael.Martinez.TiposDeDatos;

public class BaseNumero {

    public static void main(String[] args) {
        int octal = 017;            //15 en decimal
        short octalshort = 017;     //15 en decimal
        int hex = 0xFF;             //255 en decimal
        double hexdouble = 0xFF;    //255 en decimal
        int binary = 0b10;          //2 en decimal

        System.out.println(octal);
        System.out.println(hex);
        System.out.println(binary);
        System.out.println(hexdouble);
        System.out.println(octalshort);
    }
}
