package com.Nathanael.Martinez.Capitulo1.PackageEImports;

import java.util.*;
import java.sql.*;
import java.util.Date;

//Se tiene un error debido a que sql y util cuentan con una clase Date por lo que lo ideal seria importar de manera explicita el paquete a utilizar

public class EjemploConflictoDeNombre {

    java.sql.Date date; //Esto se hace en el caso de qyue necesitemos de ambas clases con el mismo nombre pero de paquetes distintos

}
