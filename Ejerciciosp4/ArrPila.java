public class ArrPila<T> implements Pila<T> {
    private Arreglo<T> pila;
    private int tamMax;

    public ArrPila(int tam) {
        if (tam <= 0)
            throw new IllegalArgumentException("El tamaño de la pila debe ser positivo");
        pila = new Arreglo<T>(tam);
        tamMax = tam;
    }

    @Override
    public void apilar(T item) {
        if (item == null) 
            throw new IllegalArgumentException("El item a apilar es nulo");

        if (pila.longitud() < tamMax) {
            pila.insertarInicio(item);
        } else {
            throw new IllegalStateException("La pila está llena");
        }
    }

    @Override
    public void desapilar() {
        if (pila.longitud() > 0) {
            pila.eliminar(pila.buscarElem(0));
        } else {
            throw new IllegalStateException("La pila está vacía");
        }

    }

    @Override
    public T tope() {
        if (esVacia())
            throw new IllegalStateException("La pila está vacía");
        return pila.buscarElem(0);
    }

    @Override
    public boolean esVacia() {
        return pila.longitud() == 0;
    }

    @Override
    public void vaciar() {
        if (esVacia())
            throw new IllegalStateException("La pila está vacía");
        pila.vaciar();
    }
    
    @Override
    public int longitud() {
        return pila.longitud();
    }

    @Override
    public void imprimir() {
        if (esVacia())
            throw new IllegalStateException("La pila está vacía");  
        pila.imprimir();
    }
}
