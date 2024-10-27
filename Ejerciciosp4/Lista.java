
interface Lista<T> {
    public void insertarFin(T item);

    public void insertarInicio(T item);

    public void insertarPos(T item, int pos);

    public boolean eliminar(T item);

    public int buscar(T item);

    public int longitud();

    public void imprimir();
}
