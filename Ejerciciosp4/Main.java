
public class Main {
    public static void main(String[] args) {

        System.out.println("\n --------------- Prueba con arreglo ---------------");
        Arreglo<String> arreglo = new Arreglo<>(10);
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
        ArrPila<Integer> pila = new ArrPila<>(10);
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
        System.out.println("El tope de la pila es (deberia ser el segundo elemento en apilarse): " + pila2.tope());
        pila2.vaciar();
        System.out.println("La pila está vacía?, luego de vaciarla... " + pila2.esVacia());
    
        System.out.println("\n --------------- Prueba con arreglo, pero usando colas ------------------------ ");
        ArrCola<Integer> cola = new ArrCola<>(10);
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        cola.imprimir();
        System.out.println("Tamaño de la cola: " + cola.longitud());
        System.out.println("La cola está vacía? " + cola.esVacia());
        cola.desencolar();
        System.out.println("Tamaño después de desencolar: " + cola.longitud());
        System.out.println("La cola usando desencolar (Deberia haberse eliminado el primer elemento en entrar): ");
        cola.imprimir();
        cola.vaciar();
        System.out.println("La cola está vacía?, luego de vaciarla... " + cola.esVacia());

        System.out.println("\n ---------------- Prueba con lista enlazada, pero usando colas ------------------ ");
        ListaEnlazCola<Integer> cola2 = new ListaEnlazCola<>();
        cola2.encolar(1);
        cola2.encolar(2);
        cola2.encolar(3);
        cola2.imprimir();
        System.out.println("Tamaño de la cola: " + cola2.longitud());
        System.out.println("La cola está vacía? " + cola2.esVacia());
        cola2.desencolar();
        System.out.println("Tamaño después de desencolar: " + cola2.longitud());
        System.out.println("La cola usando desencolar (Deberia haberse eliminado el primer elemento en entrar): ");
        cola2.imprimir();
        cola2.vaciar();
        System.out.println("La cola está vacía?, luego de vaciarla... " + cola.esVacia());
    }
}