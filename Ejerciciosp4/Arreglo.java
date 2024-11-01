
public class Arreglo<T> implements Lista<T> {
    private T[] arreglo;
    private int tamaño;

    @SuppressWarnings("unchecked")
    public Arreglo(int tam) {
        if (tam < 1)
            throw new IllegalArgumentException("El tamaño es inválido");
        arreglo = (T[]) new Object[tam];
        tamaño = 0;
    }

    @Override
    public void insertarInicio(T item) {
        if (item == null)
            throw new IllegalArgumentException("El item es nulo");
        if (tamaño < arreglo.length) {
            for (int i = tamaño + 1; i > 0; i--) {
                arreglo[i] = arreglo[i - 1];
            }
            arreglo[0] = item;
            tamaño++;
        } else {
            System.out.println("La lista está llena");
        }
    }

    @Override
    public void insertarFin(T item) {
        if (item == null)
            throw new IllegalArgumentException("El item es nulo");
        if (tamaño < arreglo.length) {
            arreglo[tamaño] = item;
            tamaño++;
        } else {
            System.out.println("La lista está llena");
        }
    }

    @Override
    public boolean eliminar(T item) {
        if (item == null)
            throw new IllegalArgumentException("El item es nulo");
        for (int i = 0; i < tamaño; i++) {
            if (arreglo[i].equals(item)) {
                for (int j = i; j < tamaño - 1; j++) {
                    arreglo[j] = arreglo[j + 1];
                }
                tamaño--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void insertarPos(T item, int pos) {
        if (item == null)
            throw new IllegalArgumentException("El item es nulo");
        if (pos >= 0 && pos <= tamaño) {
            for (int i = tamaño; i > pos; i--) {
                arreglo[i] = arreglo[i - 1];
            }
            arreglo[pos] = item;
            tamaño++;
        } else {
            System.out.println("La posición no existe");
        }
    }

    @Override
    public int buscar(T item) {
        if (item == null)
            throw new IllegalArgumentException("El item es nulo");
        for (int i = 0; i < tamaño; i++) {
            if (arreglo[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int longitud() {
        return tamaño;
    }

    @Override
    public void imprimir() {
        if (tamaño == 0)
            System.out.println("El arreglo esta vacío");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("El elemendo " + (i + 1) + " tiene la información de: " + arreglo[i] + "\n");
        }
    }

    @Override
    public void vaciar() {
        tamaño = 0;
    }

    @Override
    public T buscarElem(int pos){
        if(pos >= 0 && pos < tamaño){
            return arreglo[pos];
        }else{
            return null;
        }
    }
}