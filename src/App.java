import introduccion.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        // para poder imprimir en consola
        // se hace por medio del metodo(función) println
        // la cual se ubica en System.out
        //System.out.println("Hola hola");

        // declaración
        Estudiante juan = new Estudiante(4444444);
        System.out.println();
        juan.id_credencial = 23;
        juan.nombre = "Juan alberto";
        Estudiante perla = new Estudiante(12345,342,2,20,2,"Perla María","C");
        
        System.out.println();
    }
}
