package com.Nathanael.Martinez.TiposDeDatos;

public class LiteralNumericaGuionBajo {

    public static void main(String[] args) {
        //## Ejemplos NO validos, no compilan. ##

        //double noAlInicio = _1000.00;
        //double noAlFinal = 1000.00_;
        //double noDespuesDelPuntoDecimal = 10._0;
        //double noAntesDelPuntoDecimal = 10_.0;
        //float f = 9.2_0;


        //## Ejemplos validos ##
        short a = 10____0;
        double b = 9.0_1_9_1;
        float c = 1.0_0f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
