package abstraccion;

public class Gente implements Bailador {

    private String nombre;

    public Gente (String nombre){
        this.nombre = nombre;
    }

    @Override
    public void bailar() {
        System.out.println("Soy "+this.nombre+" y Estoy bailando");
    }

    
    
}
