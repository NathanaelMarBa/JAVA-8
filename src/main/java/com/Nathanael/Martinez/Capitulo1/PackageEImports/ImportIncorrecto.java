package com.Nathanael.Martinez.Capitulo1.PackageEImports;

import java.*;                  //Solo buscaria clases dentro del paquete java
//import java.util.a*;          //No compilaria ya que no se busca de esta manera.
//import java.nio.*.*;          //Solo se permite un wildcart y debe de ser al final del import;
import java.util.ArrayList.*;   //A pesar de que si compila busca las clases publicas anidadas dentro de la clase ArrayList y ni siqueira esta importando la misma.


public class ImportIncorrecto {
    public static void main(String[] args) {
        System.out.println("Imporrts Incorrectos");
    }
}
