package Alumno;
import Asignatura.Asignatura;
import Lista_Ref.Ref_asignaturas_alumnos;
/*
CLASE ALUMNO:
ES UN TIPO DE DATO QUE ENGLOBA TODAS LAS FUNCIONALIDADES DE UN ALUMNO,
DATOS DE ESTE, Y MATRICULACIONES

-Implementa la interfaz COMPARABLE, útil para ordenar listas de alumnos
en un orden arbitrario.
*/

public class Alumno implements Comparable <Alumno>{
    //String, nombre del alumno
   private String nombre;
    //String, dni del alumno
   private String dni;
    //Lista de asignaturas a las que está matriculado el alumno
   private Ref_asignaturas_alumnos lista_ref_asignatura;
   
   //Constructor
   public Alumno(String nom,String code){
       nombre=nom;
       dni=code;
       lista_ref_asignatura=new Ref_asignaturas_alumnos();
   }
   //Metodos GET
   public String getDni(){
       return dni;
   }
   public String getNombre(){
       return this.nombre;
   }

   public int getUnicode(){
       int unicode=0;
       for (int i = 0; i < nombre.length(); i++) {
           unicode+=unicode+(int)nombre.charAt(i);
       }
       return unicode;
   }
   
   
   @Override
   public String toString(){
       String res="Nombre: "+this.nombre+ " DNI: "+this.dni;
       return res;
   }

   
    @Override
    public int compareTo(Alumno alumno) {
        int resultado;
        resultado=this.nombre.compareTo(alumno.nombre);
        
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
    //MÉTODOS RELACIONADOS CON LA LISTA DE REFERENCIA
    //Añade una asignatura a la lista de referencia
    public void add(Asignatura x){
        
        lista_ref_asignatura.add_nodo(x);
    }
    //Quita una asignatura de la lista de referencia
    public void remove(Asignatura x){
       
        lista_ref_asignatura.remove_nodo(x);
    }
    //Metodo que devuelve la asignatura 'i' de la lista de referencia
    public Asignatura getAsignaturaRef(int i) {
        return (Asignatura)lista_ref_asignatura.getInfo(i);
    }

    //Método que devuelve la cantidad de nodos que hay en la lista de referencia
    public int getSizeRef() {
        return lista_ref_asignatura.size();
    
    }



}
