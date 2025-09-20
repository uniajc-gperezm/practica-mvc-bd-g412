package Vista;

import Modelo.Estudiante;

public class VistaEstudiante {
    
    public void mostrarDetallesEstudiante(Estudiante estudiante) {
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
    }
}
