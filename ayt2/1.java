import java.io.*; 
import java.util.*; 
public class Ejercicios{
    
    public static void NombresExtranos(char Nombre[]){
        Stack<Character> Pila = new Stack<Character>();
        for (int i = 0; i < Nombre.length; i++){
            Pila.push(Nombre[i]);
        }
        for (int i = 0; i < Nombre.length; i++){
            System.out.print(Pila.pop());
        }
    }
    public static void printInverse(char Nombre[], int index) {
        if(index == Nombre.length) return;
        //System.out.print(Nombre[index]); // cola
        printInverse(Nombre, index + 1);
        System.out.print(Nombre[index]); // pila
    }
    public static void main(String[] args) {
        /* Nombres extraños */
        String nombre = "Casa";
        //NombresExtranos(nombre.toCharArray());
        printInverse(nombre.toCharArray(), 0);
    }
}

