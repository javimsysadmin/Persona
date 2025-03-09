package com.miapp;
/**
 * @author Javier Martos
 * @version V:01
 */
public class Main {
    /**
     *
     * @param args argumentos de la clase Persona
     */
    public static void main(String[] args) {
        // Crear objeto de la clase Persona
        Persona persona = new Persona("Javier", "Martos", 47, "Hombre");
        // Mostrar información de la persona
        persona.mostrarInformacion();

        // Modificar atributos usando setters
        persona.setNombre("Cesar");
        persona.setApellidos("Martos");
        persona.setEdad(30);
        persona.setSexo("Hombre");

        // Mostrar información actualizada de la persona
        persona.mostrarInformacion();

    }
}
