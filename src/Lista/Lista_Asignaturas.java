package Lista;

import Asignatura.Asignatura;
import Interfaces.Lista_interface;
import java.util.ArrayList;
import java.util.Collections;
//CLASE LISTA DE ASIGNATURAS:
//ENGLOBA TODAS LAS FUNCIONALIDADES PARA GESTIONAR UNA LISTA DE ASIGNATURAS
//-Implementa la interfaz Lista_interface

public class Lista_Asignaturas implements Lista_interface {
    // Lista Asignaturas
    private ArrayList<Asignatura> lista;
    
    //Consturctor
    public Lista_Asignaturas() {
        lista = new ArrayList<Asignatura>();
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

        return "Esta Asignatura no esta en esta lista";
    }

    public Asignatura getAsignatura(int i) {
        return lista.get(i);
    }
    public int getIndice(Asignatura a){
        return lista.indexOf(a);
    }

    @Override
    public String getInfoLista() {
        String infoTotal = "";
        for (int i = 0; i < this.getSize(); i++) {
            infoTotal += lista.get(i).toString() + "\n";
        }
        return infoTotal;
    }

    //METODOS DE GESTION DE LA LISTA
    @Override
    public void addObject(Object o) {
        lista.add((Asignatura) o);

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

}
