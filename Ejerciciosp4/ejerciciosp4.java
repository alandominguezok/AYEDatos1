import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejerciciosp4 {

    public static LinkedList<Integer> generarListaAleatoria(int n) {
        LinkedList<Integer> lista = new LinkedList<>();
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            int numAleatorio = random.nextInt(101);
            lista.add(numAleatorio);
        }
        return lista;
    }

    public static Boolean estaElemento(List<Integer> x, Integer N) {
        for (int i=0;i<x.size(); i++) {
            if (x.get(i) == N) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> x){
        ArrayList<Integer> a = x;
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size()-1;j++){
                if(x.get(j) > a.get(j+1)){
                    int aux = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, aux);
                }
            }
        }
        return a;
    }

    public static void main(String[] args){
        Random random2 = new Random();
        LinkedList<Integer> listaAleatoria = generarListaAleatoria(10);
        int numA = random2.nextInt(100);
        System.out.println("Lista generada: " + listaAleatoria);
        System.out.println("¿El número "+ numA + " está en la lista? " + estaElemento(listaAleatoria,numA));
        System.out.println("Lista aleatoria ordenada: "+ bubbleSort(new ArrayList<>(listaAleatoria)));
    }
}

