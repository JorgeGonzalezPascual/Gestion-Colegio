package Asignatura;

import Alumno.Alumno;

//CLASE OPTATIVA, DERIVA DE ASIGNATURA
//-La particularidad de las asignaturas optativas es que son de un perfil

public class Optativa extends Asignatura{
    //Perfil, puede ser TEORICO o PRACTICO
    Perfil perfil;
    
    
    //CONSTRUCTORES
    public Optativa(int cod, String nombre,Perfil perfil) {
        super(cod, nombre);
        this.perfil=perfil;
    }
    public Optativa(int cod, String nombre,int perfil){
        super(cod, nombre);
        this.perfil=Perfil.values()[perfil];
    }

    @Override
    public String toString() {
        return nombre+" CODIGO: "+codigo+" PERFIL: "+perfil;
    }

    @Override
    public String getNombre() {
       return nombre;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
    public Perfil getPerfil(){
        return this.perfil;
    }

   
    @Override
    public void setNombre(String name) {
        nombre=name;
    }

    @Override
    public void setCodigo(int cod) {
        codigo=cod;
    }
    
    public void setPerfil(int perfil) {
        this.perfil=Perfil.values()[perfil];
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil=perfil;
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
    public  Alumno getAlumnoRef(int i){
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

