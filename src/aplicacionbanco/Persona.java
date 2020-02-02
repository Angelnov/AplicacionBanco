/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionbanco;

/**
 *
 * @author Angelau
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String fnacimiento;
    
    
    public Persona(String nombre, String apellidos, String fnacimiento){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fnacimiento=fnacimiento;
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the fnacimiento
     */
    public String getFnacimiento() {
        return fnacimiento;
    }

    /**
     * @param fnacimiento the fnacimiento to set
     */
    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
}
