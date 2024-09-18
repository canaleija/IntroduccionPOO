import introduccion.Credencial;
import introduccion.Estudiante;
import introduccion.Fecha;

public class App {
    public static void main(String[] args) throws Exception {
       Fecha fecha = new Fecha(2, 3, 1994);
       System.out.println(fecha.getDia());
       System.out.println(fecha.getMes());
       System.out.println(fecha.getAnio());

       fecha.setAnio(2000);
       System.out.println(fecha.getAnio());

    }
}
