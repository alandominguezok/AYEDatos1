
public class ListaEnlazCola<T> implements Cola<T>{
    private ListaEnlazada<T> cola;

    public ListaEnlazCola() {
        cola = new ListaEnlazada<T>();
    }
    
    @Override
    public void encolar(T item){
        if (item == null) 
            throw new IllegalArgumentException("El elemento a encolar es nulo.");
        cola.insertarPos(item, cola.longitud()); 
    }

    @Override
    public T desencolar(){
        if (esVacia())
            throw new IllegalStateException("La cola está vacía.");
        T elemFrente = cola.buscarElem(0);
        cola.eliminar(elemFrente);
        return elemFrente;
    }

    @Override
    public boolean estaLlena(){
        return false;
    }

    @Override
    public boolean esVacia(){
        return cola.longitud()==0;
    }

    @Override
    public void vaciar(){
        if (esVacia())
            throw new IllegalStateException("La cola está vacía");
        cola.vaciar();
    }

    @Override
    public int longitud(){
        return cola.longitud();
    }

    @Override
    public void imprimir(){
        cola.imprimir();
    }
}
