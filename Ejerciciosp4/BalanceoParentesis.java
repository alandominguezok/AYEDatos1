import java.util.Scanner;
import java.util.Stack;

public class BalanceoParentesis {
    // Ejercicio 6
    public static boolean verificarBalanceo(String expresion) {
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(') 
                pila.push(c);
            else if (c == ')') {
                if (pila.isEmpty()) {
                    return false;  
                }
                pila.pop();
            }
        }
        return pila.isEmpty();
    }

    //Ejercicio 9 
    // Reimplementar el ejercicio 6 utilizando cada una de las clases de Pilas
    // implementadas en el ejercicio 7. Verificar que el programa funciona cómo
    // se espera.
    public static boolean verificarBalanceoPilaArr(String expresion) {
        int tamaño = expresion.length();
        ArrPila<Character> pila = new ArrPila<Character>(tamaño);
        for (int i = 0; i < tamaño; i++) {
            char c = expresion.charAt(i);
            if (c == '(') {
                pila.apilar(c);
            } else if (c == ')') {
                if (pila.esVacia()) {
                    return false;
                }
                pila.desapilar();
            }
        }
        return pila.esVacia();
    }

    public static boolean verificarBalanceoPilaEnl(String expresion) {
        int tamaño = expresion.length();
        ListaEnlazPila<Character> pila = new ListaEnlazPila<Character>();
        for (int i = 0; i < tamaño; i++) {
            char c = expresion.charAt(i);
            if (c == '(') {
                pila.apilar(c);
            } else if (c == ')') {
                if (pila.esVacia()) {
                    return false;
                }
                pila.desapilar();
            }
        }
        return pila.esVacia();
    }


    public static void main(String[] args) {

        System.out.println("Ingrese una expresion para verificar balanceo con stack: ");
        Scanner expresion = new Scanner (System.in);
        String exp = expresion.nextLine();
        if (verificarBalanceo(exp)) {
            System.out.println("La expresión "+ exp +" está balanceada.");
        } else {
            System.out.println("La expresión "+ exp +" no está balanceada.");
        }
        

        System.out.println("\n Ingrese una expresion para verificar balanceo con pila de arreglos: ");
        String exp2 = expresion.nextLine();
        if (verificarBalanceoPilaArr(exp2)) {
            System.out.println("La expresión "+ exp2 +" está balanceada.");
        } else {
            System.out.println("La expresión "+ exp2 +" no está balanceada.");
        }

        System.out.println("\n Ingrese una expresion para verificar balanceo con pila enlazada: ");
        String exp3 = expresion.nextLine();
        if (verificarBalanceoPilaEnl(exp3)) {
            System.out.println("La expresión "+ exp3 +" está balanceada.");
        } else {
            System.out.println("La expresión "+ exp3 +" no está balanceada.");
        }
        expresion.close();
    }
}
