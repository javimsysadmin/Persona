package com.miapp;
/**
 * @author Javier Martos
 * @version V:02
 */
public class Main {
    /**
     *
     * @param args argumentos de la clase Persona
     */
    public static void main(String[] args) {
        // Crear objeto de la clase Persona
        Persona persona1 = new Persona("Javier", "Martos", 47, "Hombre");
        Persona persona2 = new Persona("Cesar", "Martos", 50, "Hombre");
        Persona persona3 = new Persona("María", "Martos", 52, "Mujer");

        /* Mostrar información de la persona
        persona.mostrarInformacion();

        Modificar atributos usando setters
        persona.setNombre("Cesar");
        persona.setApellidos("Martos");
        persona.setEdad(30);
        persona.setSexo("Hombre")


        Mostrar información actualizada de la persona
        persona.mostrarInformacion();
        */

        // Usar los métodos get para acceder a los atributos del primer objeto
        String nombre1 = persona1.getNombre();
        String apellidos1 = persona1.getApellidos();
        int edad1 = persona1.getEdad();
        String sexo1 = persona1.getSexo();

        // Usar los métodos get para acceder a los atributos del segundo objeto
        String nombre2 = persona2.getNombre();
        String apellidos2 = persona2.getApellidos();
        int edad2 = persona2.getEdad();
        String sexo2 = persona2.getSexo();

        // Usar los métodos get para acceder a los atributos del tercer objeto
        String nombre3 = persona3.getNombre();
        String apellidos3 = persona3.getApellidos();
        int edad3 = persona3.getEdad();
        String sexo3 = persona3.getSexo();

        // Mostrar los valores obtenidos del primer objeto
        System.out.println("Nombre: " + nombre1);
        System.out.println("Apellidos: " + apellidos1);
        System.out.println("Edad: " + edad1);
        System.out.println("Sexo: " + sexo1);

        // Mostrar los valores obtenidos del segundo objeto
        System.out.println("Nombre: " + nombre2);
        System.out.println("Apellidos: " + apellidos2);
        System.out.println("Edad: " + edad2);
        System.out.println("Sexo: " + sexo2);

        // Mostrar los valores obtenidos del segundo objeto
        System.out.println("Nombre: " + nombre3);
        System.out.println("Apellidos: " + apellidos3);
        System.out.println("Edad: " + edad3);
        System.out.println("Sexo: " + sexo3);



    }
}
