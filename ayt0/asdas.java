import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String str = stdin.next(),
            str_invertido = "";
        for(int i = str.length() - 1; i >= 0; --i) {
            str_invertido += str.charAt(i); 
        }
        System.out.println(str_invertido);
    }
}