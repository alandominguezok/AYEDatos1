
public class ListaArrPila<T> implements Pila<T> {
    private ListaArreglo<T> pila;
    private int tamMax;

    public ListaArrPila(int tam) {
        pila = new ListaArreglo<T>(tam);
        tamMax = tam;
    }

    @Override
    public void apilar(T item){
        if (pila.longitud() < tamMax) {
            pila.insertarInicio(item);
            pila.cambiarLongitud(pila.longitud()+1);
        } else {
            System.out.println("La pila está llena");
        }
    }

    @Override
    public void desapilar(){
        if(pila.longitud() > 0){
            pila.eliminar(pila.obtenerArreglo()[0]);
        }else{
            System.out.println("La pila está vacía");
        }
        
    }

    @Override
    public T tope(){
        if (esVacia()) throw new IllegalArgumentException("La pila está vacía");
        return pila.obtenerArreglo()[0];
    }

    @Override
    public boolean esVacia(){
        return pila.longitud() == 0;
    }

    @Override
    public void vaciar(){
        pila.vaciar();
    }
}
