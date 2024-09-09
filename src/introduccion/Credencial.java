package introduccion;

public class Credencial {
    public String nombre;
    public String programa_academico;
    public int boleta;
    public Fecha fecha_emision;
    public Fecha fecha_vigencia;
    public String unidad_academica;

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
}
