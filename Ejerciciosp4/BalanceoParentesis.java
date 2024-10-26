import java.util.Scanner;
import java.util.Stack;

public class BalanceoParentesis {
    public static boolean verificarBalanceo(String expresion) {
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(') {
                pila.push(c);
            }
            else if (c == ')') {
                if (pila.isEmpty()) {
                    return false;  
                }
                pila.pop();
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Ingrese una expresion: ");
        Scanner expresion = new Scanner (System.in);
        String exp = expresion.nextLine();

        if (verificarBalanceo(exp)) {
            System.out.println("La expresión "+ exp +" está balanceada.");
        } else {
            System.out.println("La expresión "+ exp +" no está balanceada.");
        }
        expresion.close();
    }
}
