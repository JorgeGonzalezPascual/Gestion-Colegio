/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_Ref;

/**
 *
 * @author marc
 */
public class Nodo {

    private Object x;
    private Nodo siguiente;
/**
 * Constructor que inicializamos los atributos a Null 
 */
    public Nodo(Object x,Nodo n) {
        this.x = x;
        siguiente = n;
    }
/**
 * Método que cambia el valor del object a x
 * @param x Objeto nuevo de x
 */
    public Nodo(Object x) {
        this.x = x;
        //siguiente = null;
    }
/**
 * Metodo que retorna el nodo al que apunta este nodo
 * @return nodo apuntado
 */
    public Nodo get_nodo() {
        return this.siguiente;
    }
/**
 * Método que cambia el nodo apuntado por el parámetro
 * @param x nodo
 */
    public void set_nodo(Nodo x) {
        this.siguiente = x;
    }
/**
 * Método que retorna el objeto de dicho nodo
 * @return x
 */
    public Object get_object() {
        return this.x;
    }
/**
 * Método booleano para saber si el campo x de un nodo esta vacío
 * @return true si el campo es null
 */
    public boolean isEmpty() {
        return this.x == null;
    }
/**
 * Cambia el objeto del nodo a x y pone un nuevo nodo a siguiente
 * @param x objeto que se pondra en this.x
 */
    public void set_Object(Object x) {
        this.x = x;
        siguiente = new Nodo(null);
    }
}
