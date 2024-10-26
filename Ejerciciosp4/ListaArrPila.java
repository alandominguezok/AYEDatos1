
public class ListaArrPila<T> implements Pila<T> {
    private ListaArreglo<T> pila;
    
    @SuppressWarnings("unchecked")
    public ListaArrPila(int tam) {
        pila = new ListaArreglo<T>(tam);
        tamaño = 0;
    }

    @Override
    public void apilar(T item){
        if (tamaño < pila.tamaño()) {
            pila.insertarInicio(item);
        } else {
            System.out.println("La pila está llena");
        }
    }

    @Override
    public void desapilar(){

    }

    @Override
    public T tope(){
        return null;
    }

    @Override
    public boolean esVacia(){
        return true;
    }

    @Override
    public void vaciar(){

    }
}
