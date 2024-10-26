
public class Main{
    public static void main(String[] args) {
        ListaArreglo<String> lista = new ListaArreglo<>(10);
        lista.insertarInicio("Hola");
        lista.insertarFin("Mundo");
        lista.insertarInicio("pepe");
        lista.imprimir();
        System.out.println("Tamaño usando arreglo: " + lista.tamaño());
        System.out.println("Buscar 'Hola': " + lista.buscar("Hola"));
        System.out.println("Buscar 'Adiós': " + lista.buscar("Adiós") + "\n");

        lista.eliminar("Hola");
        System.out.println("Tamaño después de eliminar 'Hola': " + lista.tamaño());
        System.out.println("Buscar 'Hola': " + lista.buscar("Hola") + "\n");
        lista.imprimir();


        ListaEnlazada<String> listaEnlazada = new ListaEnlazada<String>();
        listaEnlazada.insertarInicio("Hola");
        listaEnlazada.insertarFin("Mundo");
        System.out.println("Tamaño usando lista enlazada: " + listaEnlazada.tamaño());
        System.out.println("Buscar 'Hola': " + listaEnlazada.buscar("Hola"));
        System.out.println("Buscar 'Adiós', sin que lo haya agregado: " + listaEnlazada.buscar("Adiós") + "\n");
        listaEnlazada.insertarPos("Estoy",2);
        System.out.println("Buscar 'Estoy' despues de insertar en la posicion 2: " + listaEnlazada.buscar("Estoy"));
        System.out.println("Tamaño después de insertar en pos 2: " + listaEnlazada.tamaño());
        listaEnlazada.eliminar("Hola");
        System.out.println("Tamaño después de eliminar 'Hola': " + listaEnlazada.tamaño());

        listaEnlazada.imprimir();

    }
}