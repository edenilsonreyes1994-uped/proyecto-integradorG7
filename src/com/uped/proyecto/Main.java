package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Prueba Ejemplo Integrador: Gerente ---");
        Gerente g = new Gerente("Marta Díaz", "05123456-7", 1200.0, 5);
        System.out.println(g);
        System.out.println("Beneficio: " + g.calcularBeneficioAnual());

        System.out.println("\n--- 2. Prueba Downcasting Seguro ---");
        Persona[] personas = {
            new Empleado("Ana", "04...", 800.0),
            new Gerente("Luis", "05...", 1500.0, 3)
        };
        
        for (Persona p : personas) {
            if (p instanceof Gerente) {
                Gerente gerenteCast = (Gerente) p; 
                System.out.println(gerenteCast.presentarse() + " -> Tamaño de equipo: " + gerenteCast.getTamanoEquipo());
            }
        }

        System.out.println("\n--- 3. Prueba Ejercicio Práctico 1: DocenteInvestigador ---");
        DocenteInvestigador di = new DocenteInvestigador(
            "Dr. Iván Reyes", "07321456-9", "Ingeniería de Software", 8, 4
        );
        System.out.println(di);
        System.out.println("Beneficio: " + di.calcularBeneficioAnual());
    }
}