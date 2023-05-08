/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorDeCitas;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MIKI
 */
public class GestorDeCitas {
    //el ponerlo en estatico genere un espacio para estas lista y se mantengan
    //en todo el proceso
    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
    
    public static List<String> horaDisponibles = new ArrayList<>();
    public static List<String> fechaDisponibles = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //genero las listas en blanco par todo el sistema hasta que se cierre
        citasEnElSistema = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeMedicos = new ArrayList<>();
        
        
        horaDisponibles.add("9:00am");
        horaDisponibles.add("9:30am");
        horaDisponibles.add("10:00am");
        horaDisponibles.add("10:30am");
        horaDisponibles.add("11:00am");
        horaDisponibles.add("11:30am");
        
        fechaDisponibles.add("05/05/2023");
        fechaDisponibles.add("06/05/2023");
        fechaDisponibles.add("07/05/2023");
        fechaDisponibles.add("08/05/2023");
        fechaDisponibles.add("09/05/2023");
        //inicio la ventana principal de gestor de citas
        JFrameGestorDeCitas framePrincipal = new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null);//centra el formulario
        framePrincipal.setVisible(true);
    }
    
}
