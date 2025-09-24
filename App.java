import modelo.Estudiante;
import vista.VistaEstudiante;
import controlador.ControladorEstudiante;

public class App {
  public static void main(String[] args) {
    System.out.println("Bienvenido Estudiante!");

    // Crear el modelo, la vista y el controlador
    Estudiante modelo = new Estudiante("Juan Perez", 20);
    VistaEstudiante vista = new VistaEstudiante();
    ControladorEstudiante controlador = new ControladorEstudiante(modelo, vista);

    // Actualizar la vista con los detalles del estudiante
    controlador.mostrarVista();
  }
}
