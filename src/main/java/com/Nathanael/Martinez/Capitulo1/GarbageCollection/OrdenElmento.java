package com.Nathanael.Martinez.Capitulo1.GarbageCollection;

public class OrdenElmento {

   public void crearObjetos(){
       //1. Creamos una nueva persona
       Object persona = new Object();

       //2. Asignamos una nueva persona a la referencia persona
       persona = new Object();  //Persona B

       //3. El objeto creado en la memoria en el primer punto ya no es accesible y se vuelve candidato a ser recolectado por el GB

       //4. El objeto creado en el punto 2 ya no es accesible, dado que la referencia persona a quedado fuera del scope.
   }
}
