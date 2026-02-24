/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import modelo.*;

public class LogicaElectoral {
    
    private GestorAutenticacion gestorAuth;
    private GestorPartidos gestorPartidos;
    private GestorCandidatos gestorCandidatos;
    private GestorMesas gestorMesas;
    private GestorElecciones gestorElecciones;

    public LogicaElectoral() {
        this.gestorAuth = new GestorAutenticacion(5); 
        this.gestorPartidos = new GestorPartidos(20); 
        this.gestorCandidatos = new GestorCandidatos(100); 
        this.gestorMesas = new GestorMesas(50);
        this.gestorElecciones = new GestorElecciones();
        
        cargarDatosDePrueba(); 
    }

    private void cargarDatosDePrueba() {
        this.gestorAuth.registrarOperador(new Operador("Admin", "Root", "00000000", "admin", "123"));
        System.out.println("[SISTEMA] Motor Lógico y datos semilla cargados correctamente.");
    }

    public GestorAutenticacion getGestorAuth() {
        return gestorAuth;
    }

    public void setGestorAuth(GestorAutenticacion gestorAuth) {
        this.gestorAuth = gestorAuth;
    }

    public GestorPartidos getGestorPartidos() {
        return gestorPartidos;
    }

    public void setGestorPartidos(GestorPartidos gestorPartidos) {
        this.gestorPartidos = gestorPartidos;
    }

    public GestorCandidatos getGestorCandidatos() {
        return gestorCandidatos;
    }

    public void setGestorCandidatos(GestorCandidatos gestorCandidatos) {
        this.gestorCandidatos = gestorCandidatos;
    }

    public GestorMesas getGestorMesas() {
        return gestorMesas;
    }

    public void setGestorMesas(GestorMesas gestorMesas) {
        this.gestorMesas = gestorMesas;
    }

    public GestorElecciones getGestorElecciones() {
        return gestorElecciones;
    }

    public void setGestorElecciones(GestorElecciones gestorElecciones) {
        this.gestorElecciones = gestorElecciones;
    }
    
    
}
