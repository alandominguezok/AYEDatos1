
public class Main2 {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        //Ejercicio 11
        ListaEnlazCola<String> colaImpresion = new ListaEnlazCola<>();
        colaImpresion.encolar("Trabajo1.txt");
        colaImpresion.encolar("Trabajo2.pdf");
        colaImpresion.encolar("Trabajo3.doc");
        colaImpresion.encolar("Trabajo4.txt");
        colaImpresion.encolar("Trabajo5.pdf");
        colaImpresion.encolar("Trabajo6.doc");
        colaImpresion.encolar("Trabajo7.ppp");

        while (!colaImpresion.esVacia()) {
            String trabajoActual = colaImpresion.desencolar();
            System.out.println("Imprimiendo: " + trabajoActual);
        }
        System.out.println("Todos los trabajos se han procesado correctamente...");

        //Ejercicio 12
        // Averiguar cómo se implementan las colas con arreglos circulares. Qué
        // ventajas presenta esta implementación?

        // Las colas implementadas con arreglos circulares se gestionan mediante un 
        // arreglo de tamaño fijo donde el último elemento se conecta lógicamente al primero. 
        // Esto se logra con punteros de inicio (front) y fin (rear), 
        // que avanzan de forma circular, permitiendo optimizar el uso del espacio del arreglo.

        // Encolar (insertar): Se incrementa rear usando (rear + 1) % tamaño, y se agrega el elemento.
        // Desencolar (eliminar): Se incrementa front con (front + 1) % tamaño, eliminando el elemento del frente.

        System.out.println("\n ---------------- Prueba con cola circular usando arreglos ------------- ");
        ColaCircular<String> colaCircular = new ColaCircular(5);
        colaCircular.encolar("Trabajo3.txt");
        colaCircular.encolar("Trabajo2.doc");
        colaCircular.encolar("Trabajo1.pdf");
        colaCircular.imprimir();
        String elem1 = colaCircular.desencolar();
        String elem2 = colaCircular.desencolar();
        System.out.println("Trabajos "+ elem1 + " y "+ elem2+ " finalizados...");
        colaCircular.imprimir();
        System.out.println("Agregamos nuevos trabajos...");
        colaCircular.encolar("Trabajo5.ppp");
        colaCircular.encolar("Trabajo4.pdf");
        colaCircular.imprimir();

        //Llenamos la cola
        System.out.println("Agregamos los ultimos dos trabajos a realizar...");
        colaCircular.encolar("Trabajo6.excel"); 
        colaCircular.encolar("Trabajo7.pdf");
        colaCircular.imprimir(); 
        System.out.println("\n¿La cola de trabajo está llena? "+ colaCircular.estaLlena());

        //Vaciamos la cola circular
        System.out.println("Completamos todos los trabajos...");
        while (!colaCircular.esVacia()) {
            String elemn = colaCircular.desencolar();
            System.out.println("Finalizando: "+ elemn + "\n");
        }
        System.out.println("¿Hemos completado correctamente los trabajos? "+ colaCircular.esVacia());
    }
}