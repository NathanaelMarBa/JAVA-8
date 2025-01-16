package com.Nathanael.Martinez.Capitulo1.TiposDeDatos;

public class PrimitivoVsReferencia {

    String nombre = "Nathanael";
    int tamanio = nombre.length();
    //int tamanioPrimitivo = tamanio.length(); //No compila debido a que int no contiene metodos declarados
    //int valor = null; //No se puede asignar un valor nulo a un primitivo ya que no compilaria
    String stringNulo = null;
    Integer integer = null;
}
