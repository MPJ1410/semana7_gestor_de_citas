/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import entidades.Especialidad;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MIKI
 */
public class Medico {
    /**
     * El nombre del medico
     */
    private String nombre;
    /**
     * El registro del colegio medicos del Perú
     */
    private String CMP;
   /**
    * Las especialidades del medico
    */
    private List<Especialidad> especialidades;

    public Medico(String nombre, String CMP, List<Especialidad>especialidades) throws Exception {
        this.nombre = nombre;
        this.CMP = CMP;
        this.especialidades = especialidades;
        if(especialidades==null){
            throw new Exception("No se puede crear");
        }
        
    }
    //esto agregar un elemento a lista
    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }
    
    //con esta lista puedo obtener las especialidades
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }
    //con esta puedo remplazar la lista si es que quiero crear una nueva
    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    
    /**
     * Devuelve los datos a mostrar para un List 
     * @return
     */
    
    
    public String getDatosMostrar(){
        return this.nombre +" | CMP: "+ this.CMP;
    }
    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }
}
