import java.util.*;

class Main {
    static void invStr(String str){//solucion 1
        String str_invertido = "";
        for(int i = str.length() - 1; i >= 0; --i){
            str_invertido += str.charAt(i);
        }
        System.out.println(str_invertido);
    }
    static void printInvStr(String str, int n){//solucion 2
        if(n == str.length()) return;
        printInvStr(str, n + 1);
        System.out.print(str.charAt(n) + " ");
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String str = stdin.next();
        invStr(str);
        //printInvStr(str, 0);
    }
}