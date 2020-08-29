class Main {

    static int a_cont = 1;
    static void a(int n) {
        for(int i = 1; i < n; ++i) 
            a(n - 1);
        System.out.println(a_cont++);
    }// O(N!)

    static int b_cont = 0;
    static void b(int k, int n) {
        if (k >= n)
            System.out.println(b_cont++);
        else {
            b(k + 1, n);
            b(k + 1, n);
        }
    }//O(2^N)

    static void c(int x) {
        int n = 1;
        while(n <= x){
            System.out.println(n);
            n *= 2 ;
        }
    }//O(lgN)

    static void d(int arr[], int n) {
        for(int i = 0; i < n/8; ++i)
            System.out.println(i);
    }//O(N)

    static void e(int arr[], int n){
        for(int i = 0; i < n; ++i)
            System.out.println(i);
    }//O(N)

    static void f(int arr[], int n, int k){
        if (k >= n/3) return;
        System.out.println(arr[k]);
        f(arr, n, k + 1);
    }//O(N)
    
    
    static void g(int n){
        int cont = 0;
        for(int i = 0; i < n; ++i){//O(N)
            for(int j = i; j < n; ++j){//O(N)
                for(int k = 1; k < n; k *= 2){//O(lgN)
                    System.out.println(cont++);
                }
            }
        }
    }//O(N^2lgN)

    static void h(int arr1[]) { 
        int n = arr1.length; 
        for (int i = 1; i < n; ++i) { 
            int key1 = arr1[i]; 
            int j = i - 1; 
            while (j >= 0 && arr1[j] > key1) { 
                arr1[j + 1] = arr1[j]; 
                j = j - 1; 
            } 
            arr1[j + 1] = key1; 
        } 
    }//Insertion Sort
    //O(N^2)

    static void i(int n){
        for (int i = 1; i < n; i++){//O(N)
            for (int j = i + 1; j <= n; j++){//O(N)
                for (int k = 1; k <= j; k++){//O(N)
                    System.out.println(k);
                }
            }
        }
    }// O(N^3)
    public static void main(String[] args) {
        
    }
}