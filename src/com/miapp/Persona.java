/**
 * @package paquete de miapp
 */
package com.miapp;
/**
 * @author javier
 * @version V:02
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String sexo;
    /**
     * @return devuelve los atributos de clase Getters de Persona
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
    *Constructor de Persona
    *@param atributos de Persona
    */
    public Persona(String nombre, String apellidos, int edad, String sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    /*public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("Edad: "+ edad);
        System.out.println("Sexo: "+ sexo);
    }
     */
}
