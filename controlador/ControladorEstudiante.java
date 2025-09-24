package controlador;

public class ControladorEstudiante {
    
Modelo.Estudiante modeloEstudiante;
vista.VistaEstudiante vistaEstudiante;
    
    public ControladorEstudiante(Modelo.Estudiante modeloEstudiante, vista.VistaEstudiante vistaEstudiante) {
        this.modeloEstudiante = modeloEstudiante;
        this.vistaEstudiante = vistaEstudiante;
    }
    public void Actualizarnombre(String nombre) {
        modeloEstudiante.setNombre(nombre);
    }
    public void ActualizarEdad(int edad) {
        modeloEstudiante.setEdad(edad);
    }
    public String getNombre() {
        return modeloEstudiante.getNombre();
    }
    public int getEdad() {
        return modeloEstudiante.getEdad();
    }
    public void mostrarVista() {
        vistaEstudiante.MostrarDetalle(modeloEstudiante.getNombre(), modeloEstudiante.getEdad());
    }
}

