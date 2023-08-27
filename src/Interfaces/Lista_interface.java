/*
Prototipo v1 de Interfaz AccesLlista
Autor: Pablo Núñez Pérez
24/11/2020
 */
package Interfaces;

public interface Lista_interface {
    /*
    Metodo de acceso al tamaño de la lista
    @return int cantidad de elementos de la lista
    */
    public int getSize();
    /**
     * Método que elimina un objecto x de la lista
     */
    public void removeObject(Object x);
    /*
    Metodo de acceso a la informacion de un elemento de la lista
    @parameter int i, posicion 'i' en la lista 
    @return String informacion es devuelta como una cadena de caracteres
    */
    public String getInfo(int i);
    /*
    Metodo de acceso a la informacion de un elemento de la lista
    @parameter String s, se le pasa un String que puede referirse al nombre o codigo de un elemento
    @return String informacion es devuelta como un cadena de caracteres
    */ 
    public String getInfo(String s);
    /*
    Metodo de acceso a toda la informacion de la lista
    @return String la informacion es devuelta como una cadena de caracteres, con la informacion
    de cada elemento
    */
    public String getInfoLista();
    /*
    Metodo de gestion de la lista, añade un elemento a esta
    */
    public void addObject(Object o);
    /*
    Metodo de gestion de la lista, se elimina un elemento de esta
    @parameter int i se pasa la posicion del elemento a eliminar
    */
    public void removeObject(int i);
    /*
    Método de gestion de la lista, se elimina un elemento de esta
    @parameter String s se pasa el codigo o el nombre del elemento.
    */
    public void removeObject(String s);
    /*
    Método de gestion de la lista, se ordenan los elementos de esta.
    */
    public void ordenarLista();
    /*
    Método de gestion de la lista, se ordenan los elementos en orden alfabetico ascendente
    */
       
}
