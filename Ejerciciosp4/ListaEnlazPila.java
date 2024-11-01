
public class ListaEnlazPila<T> implements Pila<T>{
    private ListaEnlazada<T> pila;

    public ListaEnlazPila() {
        pila = new ListaEnlazada<T>();
    }   
    
    @Override
    public void apilar(T item){
        if (item == null)
            throw new IllegalArgumentException("No puede agregar un item nulo");
        pila.insertarInicio(item);
    }

    @Override
    public void desapilar(){
        if (esVacia())
            throw new IllegalStateException("La pila está vacía");
        pila.eliminar(tope());
    }

    @Override
    public T tope(){
        if (esVacia())
            throw new IllegalStateException("La pila está vacía");
        return pila.buscarElem(0);
    }

    @Override
    public boolean esVacia(){
        return pila.longitud() == 0;
    }

    @Override
    public void vaciar(){
        if (esVacia())
            throw new IllegalStateException("La pila está vacía");
        while (!esVacia()){
            desapilar();
        }
    }

    @Override
    public void imprimir(){
        pila.imprimir();
    }

    @Override
    public int longitud(){
        return pila.longitud();
    }

}


