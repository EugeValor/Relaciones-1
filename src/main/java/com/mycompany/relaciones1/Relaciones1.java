/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relaciones1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author 54343
 */
public class Relaciones1 {

    public static void main(String[] args) {
        Persona P1 = new Persona();
        Persona P2 = new Persona();
        Perro PE1 = new Perro();
        Perro PE2 = new Perro();
        
    P1.setNombre("Juana");
    P1.setApellido("Derfler");
    P1.setEdad(31);
    P1.setDocumento(36369833);
    
    P2.setNombre("Julian");
    P2.setApellido("Dure");
    P2.setEdad(30);
    P2.setDocumento(37853182);
    
    PE1.setNombre("Ever");
    PE1.setRaza("Caniche");
    PE1.setEdad(10);
    PE1.setTamaño("Pequeño");
    PE2.setNombre("Roco");
    PE2.setRaza("Beagle");
    PE2.setEdad(1);
    PE2.setTamaño("Mediano");
    
    P1.setPerro(PE2);
    P2.setPerro(PE1);
    
        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }
}
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/