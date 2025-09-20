package Controlador;

import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class ControladorEstudiante {
    
    private Estudiante modelo;
    private VistaEstudiante vista;

    // setters y getters

    public void setNombreEstudiante(Estudiante modelo) {
        this.modelo = modelo;

    }

    public String getNombreEstudiante() {
        return this.modelo.getNombre();
    }
        
    public void setEdadEstudiante(Estudiante modelo) {
        this.modelo = modelo;
    }

    public int getEdadEstudiante() {
        return this.modelo.getEdad();   
    }

    public void ActualizarVista() {
        vista.mostrarDetallesEstudiante(modelo);    
    }

}
