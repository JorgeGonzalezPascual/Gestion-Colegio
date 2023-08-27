package Clases;
import Asignatura.Asignatura;
import Lista_Ref.Ref_cursos_asignaturas;

public abstract class Curso implements Comparable<Curso>{
    
    protected String nombre;
    protected int codigo;
    
    protected Ref_cursos_asignaturas lista_ref ;
       
    public Curso(int code, String nombre){
        this.nombre=nombre;
        this.codigo=code;
        lista_ref = new Ref_cursos_asignaturas();
        
    }
   @Override
    public abstract String toString();
    
    public abstract String getNombre();
    
    public abstract int getCodigo();
    
    public abstract void setNombre(String name);
    
    public abstract void setCodigo(int cod);

    public abstract Asignatura getAsignaturaRef(int i);

    public abstract int getSizeRef();

    public abstract void add(Object x);

    public abstract void remove(Object x);
}
