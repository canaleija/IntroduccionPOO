import javax.swing.JFrame;

import introduccion.Credencial;
import introduccion.Estudiante;
import introduccion.Persona;


public class App {
    public static void main(String[] args) throws Exception {
       
    Credencial credencial = new Credencial(null, null, 0, null, null, null);
    Estudiante beto = new  Estudiante("Alberto",credencial);
    System.out.println();
        beto.saludar();

    Persona paola = new Persona("Paola");
    paola.saludar();

    // polmorfismo
    Persona juan = new Estudiante();
    juan.sa
    }
}
