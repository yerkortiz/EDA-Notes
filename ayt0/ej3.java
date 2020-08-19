import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        if(n % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}