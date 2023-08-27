package Asignatura;

import Alumno.Alumno;
//CLASE OBLIGATORIA, HEREDA DE ASIGNATURA
//-Las asignaturas obligatorias tienen la particularidad de tener creditos
public class Obligatoria extends Asignatura{
    //Double, indica los creditos de la asignatura
    private Double creditos;
    
    //Constructor
    public Obligatoria(int cod, String nombre,Double cdr) {
        super(cod, nombre);
        creditos=cdr;
    }
    

    @Override
    public String toString() {
        return nombre+" CODIGO: "+codigo+" Número de Créditos: "+creditos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCodigo() {
       return codigo;
    }
    public Double getCreditos() {
        return creditos;
    }

    @Override
    public void setNombre(String name) {
       nombre=name;
    }

    @Override
    public void setCodigo(int cod) {
        codigo=cod;
    }
    
    public void setCreditos(Double cdr) {
        creditos=cdr;
    }

    @Override
    public int compareTo(Asignatura a) {
        int resultado;
        resultado=this.nombre.compareTo(a.nombre);
        
        if (resultado<0) {
            return -1;
        }else{
            if(resultado==0){
                return 0;
            }else{
                return 1;
            }
        }
    }

    @Override
    public void setCursoPerteneciente(String x) {
        this.Curso_perteneciente = x;
    }

    @Override
    public String getCursoPerteneciente() {
        return this.Curso_perteneciente;
    }

    @Override
    public Alumno getAlumnoRef(int i) {
        return (Alumno)lista_ref_alumnos.getInfo(i);
    }

    @Override
    public int getSizeRef() {
        return lista_ref_alumnos.size();
    
    }

    @Override
    public void add(Alumno x){
        
        lista_ref_alumnos.add_nodo(x);
    }
    @Override
    public void remove(Alumno x){
       
        lista_ref_alumnos.remove_nodo(x);
    }

}
