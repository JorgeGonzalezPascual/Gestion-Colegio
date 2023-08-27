
package Clases;

import Asignatura.Asignatura;

public class FP extends Curso{
    
    Especialidad especialidad;
    
    public FP(int code, String nombre, Especialidad e) {
        super(code, nombre);
        especialidad=e;
    }

    @Override
    public String toString() {
        //return "Curso: "+nombre+" FP| Especialidad:"+especialidad+ "| Código: "+codigo;
        return "FP: "+ codigo + " - " + nombre + " - " + especialidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
    public Especialidad getEspecialidad(){
        return especialidad;
    }
    @Override
    public void add(Object x){
        lista_ref.add_nodo(x);  
    }
    @Override
    public void remove(Object x){
        lista_ref.remove_nodo(x);
    }

    
    @Override
    public Asignatura getAsignaturaRef(int i) {
        return (Asignatura)lista_ref.getInfo(i);
    }

    @Override
    public void setNombre(String name) {
       nombre=name;
    }

    @Override
    public void setCodigo(int cod) {
        codigo=cod;
    }
    public void setEspecialidad(Especialidad e){
        especialidad=e;
    }
    @Override
    public  int getSizeRef(){
        return lista_ref.size();

    }

    @Override
    public int compareTo(Curso f) {
        int resultado=this.nombre.compareTo(f.nombre);
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
    
}

