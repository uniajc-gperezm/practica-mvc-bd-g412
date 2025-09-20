package controlador;

import modelo.Estudiante;
import vista.vistaEstudiante;

public class controladorEstudiante {
  private Estudiante modelo;
  private vistaEstudiante vista;

  public controladorEstudiante(Estudiante modelo, vistaEstudiante vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  public void setNombreEstudiante(String nombre) {
    modelo.setNombre(nombre);
  }

  public String getNombreEstudiante() {
    return modelo.getNombre();
  }

  public void setEdadEstudiante(int edad) {
    modelo.setEdad(edad);
  }

  public int getEdadEstudiante() {
    return modelo.getEdad();
  }

  public void actualizarVista() {
    vista.mostrarDetallesEstudiante(modelo.getNombre(), modelo.getEdad());
  }
}