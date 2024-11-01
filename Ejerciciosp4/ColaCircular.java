
public class ColaCircular<T> implements Cola<T> {
    private T[] colaCircular;
    private int MAX;
    private int front;
    private int fin;
    private int cantElementos;
    
    @SuppressWarnings("unchecked")
    public ColaCircular(int tamMax){
        if (tamMax <= 0) throw new IllegalArgumentException("El tamaño máximo debe ser mayor a 0.");
        colaCircular =  (T[]) new Object[tamMax];
        MAX = tamMax;
        front = 0;
        fin = 0;
        cantElementos = 0;
    }

    @Override
    public boolean estaLlena(){
        return longitud() == MAX;
    }

    @Override
    public boolean esVacia(){
        return longitud() == 0;
    }

    @Override
    public void encolar(T elemento){
        if (estaLlena()) throw new IllegalStateException("La cola está llena.");
        colaCircular[fin] = elemento;
        fin = (fin + 1) % MAX;
        cantElementos++;
    }

    @Override
    public T desencolar(){
        if (esVacia()) throw new IllegalStateException("La cola está vacía.");
        int elemEliminado = front;
        front = (front + 1) % MAX;
        cantElementos--;
        return colaCircular[elemEliminado];
    }

    @Override
    public void imprimir() {
        if (esVacia()) System.out.println("La cola está vacía.");
        else {
            int i = front;
            System.out.print("Realizando... \n");
            for (int count=0; count<longitud(); count++) {
                System.out.print("Imprimiendo: "+ colaCircular[i] + "\n");
                i = (i + 1) % MAX;
            }
            System.out.println();
        }
    }
    
    @Override
    public void vaciar(){
        if (esVacia()) throw new IllegalStateException("La cola está vacía.");
        front = 0;
        fin = 0;
        cantElementos = 0;
    }

    @Override 
    public int longitud(){
        return cantElementos;
    }
}
