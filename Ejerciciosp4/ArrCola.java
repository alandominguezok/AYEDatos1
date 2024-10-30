public class ArrCola<T> implements Cola<T> {
    private Arreglo<T> cola;
    private int tamMax;

    public ArrCola(int tam){
        if (tam <= 0)
            throw new IllegalArgumentException("El tamaño de la cola debe ser positivo");
        cola = new Arreglo<T>(tam);
        tamMax = tam;
    }

    @Override
    public void encolar(T item){
        if (item == null) 
            throw new IllegalArgumentException("El item a encolar es nulo");
        if (cola.longitud() < tamMax){
            cola.insertarFin(item);
        } else {
            throw new IllegalStateException("La cola está llena");
        }
    }

    @Override
    public T desencolar(){
        if (!esVacia()){
            T elemFrente = cola.obtenerArreglo()[0];
            cola.eliminar(elemFrente);
            return elemFrente;
        } else {
            throw new IllegalStateException("La cola está vacía");
        }
    }
    
    @Override
    public boolean esVacia(){
        return cola.longitud() == 0;
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
        if (esVacia())
            throw new IllegalStateException("La cola está vacía");  
        cola.imprimir();
    }
}
