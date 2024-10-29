
public class Main {
    public static void main(String[] args) {

        System.out.println("\n --------------- Prueba con arreglo ---------------");
        ListaArreglo<String> arreglo = new ListaArreglo<>(10);
        arreglo.insertarInicio("Hola");
        arreglo.insertarFin("Mundo");
        arreglo.insertarInicio("pepe");
        arreglo.imprimir();
        System.out.println("Tamaño usando arreglo: " + arreglo.longitud());
        System.out.println("Buscar 'Hola': " + arreglo.buscar("Hola"));
        System.out.println("Buscar 'Adiós': " + arreglo.buscar("Adiós") + "\n");
        arreglo.eliminar("Hola");
        System.out.println("Tamaño después de eliminar 'Hola': " + arreglo.longitud());
        System.out.println("Buscar 'Hola': " + arreglo.buscar("Hola") + "\n");
        arreglo.imprimir();

        System.out.println("\n -------------------- Prueba con lista enlazada -------------------------");
        ListaEnlazada<String> listaEnlazada = new ListaEnlazada<String>();
        listaEnlazada.insertarInicio("Hola");
        listaEnlazada.insertarFin("Mundo");
        System.out.println("Tamaño usando lista enlazada: " + listaEnlazada.longitud());
        System.out.println("Buscar 'Hola': " + listaEnlazada.buscar("Hola"));
        System.out.println("Buscar 'Adiós', sin que lo haya agregado: " + listaEnlazada.buscar("Adiós") + "\n");
        listaEnlazada.insertarPos("Estoy", 2);
        System.out.println("Buscar 'Estoy' despues de insertar en la posicion 2: " + listaEnlazada.buscar("Estoy"));
        System.out.println("Tamaño después de insertar en pos 2: " + listaEnlazada.longitud());
        listaEnlazada.eliminar("Hola");
        System.out.println("Tamaño después de eliminar 'Hola': " + listaEnlazada.longitud());
        listaEnlazada.imprimir();

        System.out.println("\n ----------------- Prueba con arreglo, pero con pilas --------------------");
        ListaArrPila<Integer> pila = new ListaArrPila<>(10);
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.imprimir();
        System.out.println("Tamaño de la pila: " + pila.longitud());
        System.out.println("La pila está vacía? " + pila.esVacia());
        pila.desapilar();
        System.out.println("Lista sin el tope: ");
        pila.imprimir();
        pila.vaciar();
        System.out.println("La pila está vacía?, luego de vaciarla... " + pila.esVacia());
        
        System.out.println("\n ------------------- Prueba con lista enlazada, pero con pilas ---------------------- ");
        ListaEnlazPila<Integer> pila2 = new ListaEnlazPila<>();
        pila2.apilar(1);
        pila2.apilar(2);
        pila2.apilar(3);
        pila2.imprimir();
        System.out.println("Tamaño de la pila: " + pila2.longitud());
        System.out.println("La pila está vacía? " + pila2.esVacia());
        pila2.desapilar();
        System.out.println("Tamaño después de desapilar el primero: " + pila2.longitud());
        System.out.println("La pila sin el tope: ");
        pila2.imprimir();
        pila2.vaciar();
        System.out.println("La pila está vacía?, luego de vaciarla... " + pila2.esVacia());
        System.out.println("El tope de la pila es (Deberia dar error que la pila está vacía): " + pila2.tope());
    }
}