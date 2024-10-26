
/**
 * Esta clase implementa el TAD Lista utilizando memoria dinámica (Nodos enlazados)
 * 
 * NOTA: existen dos versiones de listas enlazadas (con y sin ficticio). Implementar una de las dos.
 */
public class ListaEnlazada<T> implements Lista<T> {
    
    private class Nodo {
        T elem;
        Nodo siguiente;

        Nodo(T elem) {
            this.elem = elem;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;

    public ListaEnlazada(){
        //Completar

        // this.cabeza = null # Para listas sin ficticio
        // this.cabeza = new Nodo(null) # Para listas con ficticio
    }

    public void insertarFin(T item){
        //Completar
    }

    public void insertarInicio(T elem){
        //Completar
    }

    public void insertarPos(T elem, int pos){
        //Completar
    }

    public boolean eliminar(T item){
        //Completar
    }

    public int buscar(T item){
        //Completar
    }

    public int longitud(){
        //Completar
    }

    public void imprimir(){
        //Completar
    }

}
