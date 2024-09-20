import introduccion.Credencial;
import introduccion.Estudiante;
import introduccion.Fecha;

public class App {
    public static void main(String[] args) throws Exception {
       
        Estudiante perla = new Estudiante();
        Estudiante juan = new Estudiante();
        Estudiante alina = new Estudiante();
        Estudiante claudia = new Estudiante();
        Estudiante paulina = new Estudiante();

        Estudiante grupoA [] = new Estudiante[5];
        grupoA[0] = perla;
        grupoA[1] = juan;
        grupoA[2] = alina;
        grupoA[3] = claudia;
        grupoA[4] = paulina;

        for(int x=0; x < grupoA.length; x++){

            grupoA[x].getCredencial().getNombre();
        }
    }
}
