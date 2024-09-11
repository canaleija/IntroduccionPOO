import introduccion.Credencial;
import introduccion.Estudiante;
import introduccion.Fecha;

public class App {
    public static void main(String[] args) throws Exception {
        // para poder imprimir en consola
        // se hace por medio del metodo(función) println
        // la cual se ubica en System.out
        //System.out.println("Hola hola");

        // declaración
        Fecha f1 = new Fecha(12, 2, 2024);
        Fecha f2 = new Fecha(30, 12, 2030);
        Credencial aux = new Credencial("Juan Alberto", "Sistemas", 2020670089,f1,f2, "UPIIZ");
        Estudiante juan = new Estudiante(aux);

        
        System.out.println();
    }
}
