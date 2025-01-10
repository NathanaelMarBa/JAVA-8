package com.Nathanael.Martinez.Capitulo1.PackageEImports;

import com.Nathanael.Martinez.Capitulo1.PackageEImports.EjemploImport; //Este es un import redundante ya que la clases estan en el mismo paquete
import java.lang.Integer; //Este paquete no es requerido ya que se importa automaticamente
import java.util.*;
import java.util.ArrayList; //Este se vuelve redundante ya que el wildcart importa las librerias necesarias de java.util

public class EjemploImportRedundante {

    EjemploImport ejemploImport;

    ArrayList arrayList;

    Integer integer;
}
