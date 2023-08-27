package Asignatura;
import Alumno.Alumno;
import Lista_Ref.Ref_asignaturas_alumnos;

/*
CLASE ASIGNATURA, CLASE PADRE DE OBLIGATORIA Y OPTATIVA:

-Implementa la interfaz COMPARABLE, útil para ordenar listas de asignaturas
en un orden arbitrario.
 */
public abstract class Asignatura implements Comparable<Asignatura>{
    //String, nombre de la Asignatura
    protected String nombre;
    //Int, codigo de la asignatura 
    protected int codigo;
    //Lista de referencia de asignatura a alumnos
    protected Ref_asignaturas_alumnos lista_ref_alumnos;
    //String, indica el curso perteneciente de la asignatura
    protected String Curso_perteneciente;
    //Curso al que pertenece la asignatura
    //Lista referencia,ASS --> ALUMNO
    public Asignatura(int cod,String nombre){
        codigo=cod;
        this.nombre=nombre;
        lista_ref_alumnos=new Ref_asignaturas_alumnos();
    }
   @Override
    public abstract String toString();
    //Metodos GET
    public abstract String getNombre();
    
    public abstract int getCodigo();
    //Metodos SET
    public abstract void setNombre(String name);
    
    public abstract void setCodigo(int cod);

    public abstract void setCursoPerteneciente(String x);

    public abstract String getCursoPerteneciente();
    //Metodos relacionados con la lista de referencia
    public abstract Alumno getAlumnoRef(int i);

    public abstract int getSizeRef();

    public abstract void add(Alumno x);

    public abstract void remove(Alumno x);
    
    
}
