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
        edad = 0;
        semestre = 0;
        grupo = null;
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
    public Credencial getCredencial() {
        return credencial;
    }
    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }
    public int getId_lista() {
        return id_lista;
    }
    public void setId_lista(int id_lista) {
        this.id_lista = id_lista;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }


    
}
