package Clases;

import Asignatura.Asignatura;

public class Bachiller extends Curso {
    Año año;

    public Bachiller(int code, String nombre, Año a) {
        super(code, nombre);
        año = a;
    }

    @Override
    public String toString() {
        // return "Curso: "+nombre+" Bachillerato| Año:"+año+ "| Código: "+codigo;
        return "Bach: " + codigo + " - " + nombre + " - " + año;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void add(Object x) {
        lista_ref.add_nodo(x);
    }

    @Override
    public void remove(Object x) {
        lista_ref.remove_nodo(x);
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    public Año getAño() {
        return año;
    }

    @Override
    public void setNombre(String name) {
        nombre = name;
    }

    @Override
    public void setCodigo(int cod) {
        codigo = cod;
    }

    public void setAño(Año a) {
        año = a;
    }

    @Override
    public int compareTo(Curso b) {
        int resultado = this.nombre.compareTo(b.nombre);
        if (resultado < 0) {
            return -1;
        } else {
            if (resultado == 0) {
                return 0;
            } else {
                return 1;
            }

        }
    }

    @Override
    public Asignatura getAsignaturaRef(int i) {
        return (Asignatura) lista_ref.getInfo(i);
    }

    @Override
    public int getSizeRef() {
        return lista_ref.size();

    }


}
