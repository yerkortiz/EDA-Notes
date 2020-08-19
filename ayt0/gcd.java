import java.util.*;
class Main { 
    static int gcd(int a, int b) {
      System.out.println(a + " " + b);
      if(b == 0) return a;
      return gcd(b, a % b);
    }
    public static void main(String args[]) { 
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt(),
            b = stdin.nextInt();
        gcd(a, b);
    } 
} 