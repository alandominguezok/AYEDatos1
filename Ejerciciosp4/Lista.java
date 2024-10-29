
interface Lista<T> {
    void insertarFin(T item);

    void insertarInicio(T item);

    void insertarPos(T item, int pos);

    boolean eliminar(T item);

    int buscar(T item);

    int longitud();

    void imprimir();
}
