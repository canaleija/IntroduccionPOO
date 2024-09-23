package introduccion;

import java.util.LinkedList;

public class Grupo {
    private LinkedList<Estudiante> estudiantes;
    private String nombre_grupo;
    private String tutor;

    // 
    public Grupo(String nombre_grupo, String tutor) {
        this.nombre_grupo = nombre_grupo;
        this.tutor = tutor;
        // preparar la coleccion para poder agregarle a alumnos
        this.estudiantes = new LinkedList<>();

    }
    // establecer metodo para agregar estudiantes al grupo
    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);

    }

    public void mostrarEstudiantes (){
        // implmentar un ciclo que muestre los estuidantes del grupo
        System.out.println("Grupo: "+this.nombre_grupo);
        System.out.println("Tutor: "+this.tutor);
        // for enriquezido
        for(Estudiante aux: this.estudiantes){
            System.out.println("Estudiante: "+aux.getCredencial().getNombre());

        }

    }


    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    
    



    
}
