<<<<<<< HEAD
=======

package com.uped.proyecto;
import com.uped.proyecto.modelo.Cliente;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Visitante;

public class Main {
    public static void main(String[] args) {

Cliente cliente = new Cliente("Ana López", 
    "04512378-9", "7777-1234"); 
System.out.println(cliente.presentarse()); 
Visitante v = new Visitante("Kevin"); 
System.out.println(v); 
Empleado empleado = new Empleado("Luis Pérez", "06223456-1", 850.0); 
System.out.println(empleado.presentarse()); 
empleado.actualizarNombre("Luis Pérez Martínez"); 
System.out.println(empleado.presentarse()); 
    }
}
>>>>>>> d5581edd4c5c3a8b640915bb26f806b1b7a2b910
