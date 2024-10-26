
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
        this.cabeza = null; // Para listas sin ficticio
    }

    @Override
    public void insertarInicio(T item){
        Nodo aux = new Nodo(item);
        aux.siguiente = cabeza;
        cabeza = aux;
    }

    @Override
    public void insertarFin(T item){
        if (item == null) throw new IllegalArgumentException("No puede agregar un item nulo");
        Nodo aInsertar = new Nodo(item);
        if (cabeza == null) {
            cabeza = aInsertar;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = aInsertar;
        }
    }

    @Override
    public int buscar(T item){
        if (item == null) throw new IllegalArgumentException("El item a buscar es nulo");
        Nodo aux = cabeza;
        if (aux == null) return -1;
        int pos = 0;

        while(aux != null){
            if (aux.elem.equals(item)){
                return pos;
            }
            pos++;
            aux = aux.siguiente;
        }
        return pos;
    }

    @Override
    public int tamaño(){
        Nodo aux = new Nodo(null);
        aux = cabeza;
        int contador = 0;
        while(aux != null){
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }

    @Override
    public boolean eliminar(T item){
        if (cabeza != null && cabeza.elem.equals(item)) {
            cabeza = cabeza.siguiente; 
            return true;
        }
        Nodo aux = cabeza;
        while (aux != null && aux.siguiente != null) {
            if (aux.siguiente.elem.equals(item)) {
                aux.siguiente = aux.siguiente.siguiente;
                return true;
            } else {
                aux = aux.siguiente;
            }
        }
        return false;
    }

    @Override
    public void insertarPos(T elem, int pos){
        if(pos > tamaño() || pos < 0) throw new IllegalArgumentException("La posición sobrepasa el tamaño o es negativa");

        Nodo nodoAInsertar = new Nodo(elem);
        if (pos == 0){
            nodoAInsertar.siguiente = cabeza;
            cabeza = nodoAInsertar;
        }
        else{
            Nodo aux = cabeza;
            for (int i = 0; i < pos - 1; i++) {
                aux = aux.siguiente;
            }
            nodoAInsertar.siguiente = aux.siguiente;
            aux.siguiente = nodoAInsertar;
        }
    }

    @Override
    public void imprimir(){
        Nodo aux = cabeza;
        if (aux == null) System.out.println("La lista está vacía");
        int elemento = 1;
        while(aux != null){
            System.err.println("El nodo "+ elemento + " tiene la información: "+ aux.elem+ "\n");
            elemento++;
            aux=aux.siguiente;
        }
        
    }
}

