package introduccion;

public class Credencial {
    private String nombre;
    private String programa_academico;
    private int boleta;
    private Fecha fecha_emision;
    private Fecha fecha_vigencia;
    private String unidad_academica;

    public Credencial(String nombre,
                        String programa_academico,
                        int boleta,
                        Fecha fecha_emision,
                        Fecha fecha_vigencia,
                        String unidad_academica){
        this.nombre = nombre;
        this.programa_academico = programa_academico;
        this.boleta = boleta;
        this.fecha_emision = fecha_emision;
        this.fecha_vigencia = fecha_vigencia;
        this.unidad_academica = unidad_academica;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma_academico() {
        return programa_academico;
    }

    public void setPrograma_academico(String programa_academico) {
        this.programa_academico = programa_academico;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    public Fecha getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Fecha fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Fecha getFecha_vigencia() {
        return fecha_vigencia;
    }

    public void setFecha_vigencia(Fecha fecha_vigencia) {
        this.fecha_vigencia = fecha_vigencia;
    }

    public String getUnidad_academica() {
        return unidad_academica;
    }

    public void setUnidad_academica(String unidad_academica) {
        this.unidad_academica = unidad_academica;
    }

    // public String nombre;
    

}
