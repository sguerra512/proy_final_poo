package logica;
import modelo.*;

public class GestorElecciones {
    
    private Eleccion eleccionActiva; 

    public GestorElecciones() {
        this.eleccionActiva = null; 
    }

    public boolean registrarEleccion(Eleccion nuevaEleccion) {
        this.eleccionActiva = nuevaEleccion;
        return true;
    }

    public Eleccion getEleccionActiva() {
        return this.eleccionActiva;
    }

    public boolean hayEleccionConfigurada() {
        return this.eleccionActiva != null;
    }

    public void procesarEleccionActiva() {
        if (hayEleccionConfigurada()) {
            System.out.println("Iniciando escrutinio global...");

            this.eleccionActiva.realizarConteoAutomático(); 
        } else {
            System.out.println("Error: No hay ninguna elección configurada para procesar.");
        }
    }
}
