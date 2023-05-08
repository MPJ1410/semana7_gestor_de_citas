/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author MIKI
 */
public class Paciente {
    
    private String dni;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(int sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }
    private String nombre;
    private String telefono;
    private int sexoBiologico;
    //las variables estaticas se subrayan el UML
    public final static int MASCULINO=0;
    public final static int FEMENINO=1;
    /**
     * devuelve los datos a mostrar para un List
     * @return
     */
    public String getDatosMostrar(){
        return this.nombre + " - DNI: "+this.dni;
    }
    
}
