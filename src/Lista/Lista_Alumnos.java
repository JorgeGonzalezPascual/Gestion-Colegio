package Lista;

import Interfaces.Lista_interface;
import Alumno.Alumno;
import java.util.ArrayList;
import java.util.Collections;
//CLASE LISTA DE ALUMNOS:
//ENGLOBA TODAS LAS FUNCIONALIDADES PARA GESTIONAR UNA LISTA DE ALUMNOS
//-Implementa la interfaz Lista_interface

public class Lista_Alumnos implements Lista_interface {
    //Lista Alumnos
    private ArrayList<Alumno> lista;

    //Constructor
    public Lista_Alumnos() {
        lista = new ArrayList<Alumno>();
    }
    //METODOS GET
    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public String getInfo(int i) {
        String info;
        info = lista.get(i).toString();
        return info;
    }

    @Override
    public String getInfo(String s) {
        String info;
        for (int i = 0; i < this.getSize(); i++) {
            if (lista.get(i).getNombre() == s) {
                return lista.get(i).toString();
            }
        }

        return "Este alumno no esta en esta lista";

    }
    @Override
    public String getInfoLista() {
        String infoTotal = "";
        for (int i = 0; i < this.getSize(); i++) {
            infoTotal += lista.get(i).toString() + "\n";
        }
        return infoTotal;
    }
    public int getIndice(Alumno a){
        return lista.indexOf(a);
    }
    
    //METODOS DE GESTION DE LA LISTA
    @Override
    public void addObject(Object o) {
        lista.add((Alumno) o);
    }

    @Override
    public void removeObject(int i) {
        lista.remove(i);

    }

    @Override
    public void removeObject(String s) {
        for (int i = 0; i < this.getSize(); i++) {
            if (lista.get(i).getNombre() == s) {
                lista.remove(i);
            }
        }

    }

    @Override
    public void ordenarLista() {
        if (this.getSize() != 0) {
            Collections.sort(lista);
        }
    }

    @Override
    public void removeObject(Object x) {
        lista.remove(x);
    }
    public Alumno getAlumno(int i) {
        if(lista.get(i) != null)
        return lista.get(i);
        return null;
    }
}
