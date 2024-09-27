package introduccion;

public class Persona {

    private String nombre;

    public Persona (){
        this.nombre = null;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.println("Hola, soy "+this.nombre);

    }
    
    
}
