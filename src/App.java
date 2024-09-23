import java.util.LinkedList;

import introduccion.Credencial;
import introduccion.Estudiante;
import introduccion.Fecha;
import introduccion.Grupo;

public class App {
    public static void main(String[] args) throws Exception {
       
        Estudiante perla = new Estudiante();

        Credencial credeJuan = new Credencial("Juan", "Sistemas", 2023670098, new Fecha(12, 12, 2023), new Fecha(12, 12, 2028), "UPIIZ");
        Estudiante juan = new Estudiante(credeJuan);
        Estudiante alina = new Estudiante();
        Estudiante claudia = new Estudiante();
        Estudiante paulina = new Estudiante();

        Grupo gpo_1cm1 = new Grupo("1CM1","Maestro Pancho");
        gpo_1cm1.agregarEstudiante(paulina); 
        gpo_1cm1.agregarEstudiante(claudia);
        gpo_1cm1.agregarEstudiante(alina);
        gpo_1cm1.agregarEstudiante(juan);
        gpo_1cm1.mostrarEstudiantes();

    }
}
