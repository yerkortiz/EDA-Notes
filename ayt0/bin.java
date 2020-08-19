import java.util.*;
class Main {
    static void bin(int n) { // ejemplo recursivo
        if(n > 1)
            bin(n / 2); 
            // se puede hacer con op logico n >> 1
        System.out.print(n % 2 + " "); 
        // se puede hacer con op logico n & 1
    }
    static void binIt(int n) { //ejemplo iterativo
        List<Integer> list = new ArrayList<>();
        while(n >= 1) {
            list.add(n % 2);
            //list.add() inserta FIFO en ArrayList
            n /= 2;
        }
        Collections.reverse(list); 
        //invertir la lista, si conoce la edd stack quizás sea mejor insertar en la lista de forma LIFO en lugar de FIFO
        list.forEach((Integer value) -> System.out.print(value + " ")); 
        //lambda para imprimir, también se puede hacer con el clasico for(int i = 0; i < list.size();++i) ...
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        bin(n);
    }
}