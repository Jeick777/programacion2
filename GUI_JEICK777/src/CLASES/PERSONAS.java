/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.util.ArrayList;

/**
 *
 * @author Biblioteca
 */
public class PERSONAS {
    private String nombre;
    private String apellido;
    private String direccion;
    private String edad;
    
    public PERSONAS(String nombre, String apellido, String direccion, String edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.edad=edad;
      
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public ArrayList<String>lista(){
        ArrayList<String> lista= new ArrayList();
        lista.add(0,getNombre());
        lista.add(1,getApellido());
        lista.add(2,getDireccion());
        lista.add(3,getEdad());
        
        
        
        return null;
        
    }
}
