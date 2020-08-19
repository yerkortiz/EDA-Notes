import java.util.*;
class Main { 
    static void selectionSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
    public static void main(String args[]) { 
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = stdin.nextInt();
        selectionSort(arr);  
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        //Arrays.stream(arr).forEach(x -> System.out.print(x + " "));//expresion lambda
    } 
} 