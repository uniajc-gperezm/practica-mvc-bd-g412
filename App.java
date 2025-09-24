import controlador.ControladorEstudiante;
import Modelo.Estudiante;
import vista.VistaEstudiante;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Bienvenido estudiante");
        
        Estudiante modelo = new Estudiante("Abril", 21);
        VistaEstudiante vista = new VistaEstudiante();
        ControladorEstudiante controlador = new ControladorEstudiante(modelo, vista);

        controlador.mostrarVista();
    }
}
