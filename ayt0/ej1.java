import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; ++i){
            arr[i] = stdin.nextInt();
            sum += arr[i];
        }
        stdin.close();
        System.out.println(sum);
    }
}