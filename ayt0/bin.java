import java.util.*;
class Main {
    static void bin(int n) { //solucion 1
        if(n > 1)
            bin(n / 2); 
        System.out.print(n % 2 + " "); 
    }
    static void binIt(int n) { //solucion 2
        List<Integer> list = new ArrayList<>();
        while(n >= 1) {
            list.add(n % 2); //inserta en list
            n /= 2;
        }
        Collections.reverse(list); 
        list.forEach((Integer value) -> System.out.print(value + " ")); 
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        stdin.close();
        binIt(n);
    }
}