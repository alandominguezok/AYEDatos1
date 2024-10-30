
public class Main2 {
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
    }
}