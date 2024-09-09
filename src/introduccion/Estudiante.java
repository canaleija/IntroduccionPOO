package introduccion;


// atributos globales (clase)
public class Estudiante {
    // atributos variables
    public Credencial credencial;
    //public int id_credencial;
    //public int boleta;
    public int id_lista;
    public int edad;
    public int semestre;
    //public String nombre;
    public String grupo;

    // objetivo: implementar el metodo constructor
    // el identificador del constructor, tiene que ser el mismo de la clase
    
    public Estudiante(){
        this.credencial = new Credencial(null,null,0,null, null,null);
        id_lista = 0;
        edad = -10;
        semestre = 0;
        
        grupo = "Desconocido";
    }
    public Estudiante(Credencial credencial){
        // this
       this();
       this.credencial = credencial;
       
    }

    public Estudiante(Credencial credencial,int id_lista,
                      int edad,
                      int semestre,
                      String grupo){
        
        this.id_lista = id_lista;
        this.edad = edad;
        this.semestre = semestre;
        this.grupo = grupo;

    }
}
