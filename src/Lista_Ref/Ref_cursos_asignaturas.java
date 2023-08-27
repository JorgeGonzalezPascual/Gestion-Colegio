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
public class Ref_cursos_asignaturas {

    private Nodo primero;
    private Nodo vacia;

    public Ref_cursos_asignaturas() {
        primero = null;
    }

    /**
     * Añadimos un nodo con objeto curso a la lista
     *
     * @param x informacion dentro del nodo
     */
    public void add_nodo(Object x) {
         Nodo nuevo = new Nodo(x, null);
        if (primero != null) {
               
            Nodo index = primero;
            while (index.get_nodo() != null) {
                index = index.get_nodo();
            }
            index.set_nodo(nuevo);
            
        } else {
                 
            primero = nuevo;
           
        }

    }

    /**
     * Quitamos el nodo que contiene el objeto curso y restructuración de lista
     *
     * @param element
     */
    public void remove_nodo(Object element) {

         if (primero != null) {
            if (primero.get_object().equals(element)) {
                Nodo nodeBorrado = primero;
                if (primero.get_nodo() == null) {
                    primero = null;
                    nodeBorrado.set_nodo(null);
                    Nodo index2 = vacia;
                    if (index2 != null) {
                        while (index2.get_nodo() != null) {
                            index2 = index2.get_nodo();
                        }
                        index2.set_nodo(nodeBorrado);
                    } else {
                        vacia = nodeBorrado;
                    }
                } else {
                    primero = primero.get_nodo();
                    nodeBorrado.set_nodo(null);
                    Nodo index2 = vacia;
                    if (index2 != null) {
                        while (index2.get_nodo() != null) {
                            index2 = index2.get_nodo();
                        }
                        index2.set_nodo(nodeBorrado);
                    } else {
                        vacia = nodeBorrado;
                    }
                }
            } else {
                boolean trobat = false;
                Nodo index = primero;
                while (!trobat && index.get_nodo() != null) {
                    if (index.get_nodo().get_object().equals(element)) {
                        trobat = true;
                    } else {
                        index = index.get_nodo();
                    }
                }
                Nodo nodeBorrat = index.get_nodo();
                if (trobat) {
                    index.set_nodo(nodeBorrat.get_nodo());
                    nodeBorrat.set_nodo(null);
                    Nodo index2 = vacia;
                    if (index2 != null) {
                        while (index2.get_nodo() != null) {
                            index2 = index2.get_nodo();
                        }
                        index2.set_nodo(nodeBorrat);
                    } else {
                        vacia = nodeBorrat;
                    }
                } else {
                    System.out.println("Element no trobat");
                }
            }
        } else {
            System.out.println("Llista buida\n");
        }
    }


    /**
     * Simplificación del proceso de restructuración de la lista
     *
     * @param anterior nodo anterior al nodo a eliminar
     * @param siguiente nodo a eliminar
     */
    public void remove(Nodo anterior, Nodo siguiente) {
        anterior.set_nodo(siguiente.get_nodo());
        siguiente.set_nodo(null);

    }
   public Object getInfo(int i){
        Nodo aux= primero;
        int j =0;
        if (aux != null){
        while(!aux.isEmpty() && j<i ){
            j++;
            if(aux.get_nodo() != null)
            aux=aux.get_nodo();

        }
        return aux.get_object();
          }
        else {
        return null;}

    }
    public void listar(){
        Nodo aux = primero;
        if (!aux.isEmpty()){
            System.out.println(aux.get_object().toString());
            while(aux.get_nodo() != null){
                aux = aux.get_nodo();
                System.out.println(aux.get_object().toString());
                
            }
        }
        else
        System.out.println("empty");
        
    }
    public int size(){
        Nodo aux = primero;
        int t=0;
        if(aux != null){
            t++;
         while(aux.get_nodo() != null){
                t++;
                aux = aux.get_nodo();
                
         } }
         return t;
        
    }
            

}
