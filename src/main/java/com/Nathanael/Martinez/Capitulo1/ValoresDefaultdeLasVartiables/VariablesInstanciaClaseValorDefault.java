package com.Nathanael.Martinez.Capitulo1.ValoresDefaultdeLasVartiables;

public class VariablesInstanciaClaseValorDefault {

    static double w_double;
    int x_int;
    long y_long;
    static boolean z_boolean;
    char a_char;
    String b_reference;
    int a = x_int;

    public static void main(String[] args) {
        int p;
        boolean m;
        VariablesInstanciaClaseValorDefault example = new VariablesInstanciaClaseValorDefault();

        System.out.println("double: " + example.w_double);
        System.out.println("int: " + example.x_int);
        //System.out.println("local int: " + p); No compila ya que es una variable local no asignada
        System.out.println("long: " + example.y_long);
        System.out.println("boolean: " + example.z_boolean);
        //System.out.println("local boolean: " + m); No compila ya que es una variable local no asignada
        System.out.println("char: " + example.a_char);
        System.out.println("char: " + (int) example.a_char);
        System.out.println("reference: " + example.b_reference);
        System.out.println("int a: " + example.a);
    }
}
