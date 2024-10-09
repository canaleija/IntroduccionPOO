

import herencia.NuevoFrame;
import abstraccion.Cadenero;
import abstraccion.Gente;



public class App {
    public static void main(String[] args) throws Exception {
       
        Gente maria = new Gente("Maria");
        //maria.bailar();
        Gente juan = new Gente("Juan Alberto");
        //juan.bailar();

        Cadenero john = new Cadenero();
        john.dejarEntrar(juan); 
        
    }
}
