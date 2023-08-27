package Lista;

import Clases.Curso;
import Interfaces.Lista_interface;
import java.util.ArrayList;
import java.util.Collections;

public class Lista_Cursos implements Lista_interface {
    // Lista Asignaturas
    private ArrayList<Curso> lista;

    //Constructor
    public Lista_Cursos() {
        lista = new ArrayList<Curso>();
    }
    
    //Metodos GET
    @Override
    public int getSize() {
        return lista.size();
    }

    public int getIndexof(Object x) {
        return lista.indexOf(x);
    }

    public void setAt(int i, Object x) {
        lista.add(i, (Curso) x);
    }

    public Object[] getArray() {
        return lista.toArray();
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

        return "Este Curso no esta en esta lista";
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
        lista.add((Curso) o);

    }

    public void removeObject(Object x) {
        lista.remove(x);
    }

    @Override
    public void removeObject(int i) {
        lista.remove(i);
    }

    public Curso getCurso(int i) {
        return lista.get(i);
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
}
