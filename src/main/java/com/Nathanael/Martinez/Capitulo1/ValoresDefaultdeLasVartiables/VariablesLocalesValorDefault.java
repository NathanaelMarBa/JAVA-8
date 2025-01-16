package com.Nathanael.Martinez.Capitulo1.ValoresDefaultdeLasVartiables;

public class VariablesLocalesValorDefault {

    //Ejemplo 1

    {
        int x;
        int y = 10;
        //int suma x + y; //Existe un error ya que x no esta inicializado
    }

    //Ejemplo 2
        //Nos podriamos encontrar con este tipo de ejercicios en el examen
    public void test0 (boolean bandera){
        int numerIf;
        int numeroIfElse;

        if(bandera){
            numerIf = 1;
            numeroIfElse = 2;
        }else{
            numeroIfElse = 3;
        }

        //System.out.println(numerIf); //Error de compilacion ya que la varibale no se inicializa en todos los caminos
        System.out.println(numeroIfElse);
    }
}
