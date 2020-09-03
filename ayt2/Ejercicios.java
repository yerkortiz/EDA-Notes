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

    public static void main(String[] args) {
        /* Nombres extraños */
        String nombre = "Nicolas";
        NombresExtranos(nombre.toCharArray());

        System.out.println();

        /* Nueva estructura */
        NuevaEstructura Cola = new NuevaEstructura();
        Cola.Queue(15);
        Cola.Queue(17);
        System.out.println(Cola.Dequeue());
        System.out.println(Cola.Dequeue());
    }
}

class NuevaEstructura{
    Stack<Integer> S1 = new Stack<Integer>();
    Stack<Integer> S2 = new Stack<Integer>();
    
    NuevaEstructura(){}

    public void Queue(int elemento){
        this.S1.push(elemento);
    }

    public int Dequeue(){
        if (this.S2.isEmpty()){
            while(!this.S1.isEmpty()){
                this.S2.push(this.S1.pop());
            }
            return this.S2.pop();
        } else {
            return this.S2.pop();
        }
    }
}