class Main {
    static int a_cont = 1;
    static void a(int n) {
        if(n == 0) {
            System.out.println(a_cont++);
            return;
        }
        for(int i = 1; i < n; ++i) 
            a(n - 1);
        System.out.println(a_cont++);
    }
    static int b_cont = 0;
    static void b(int k, int n) {
        if (k == n)
            System.out.println(b_cont++);
        else {
            b(k + 1, n);
            b(k + 1, n);
        }
    }
    static void c(int x) {
        int n = 1;
        while(n <= x){
            System.out.println(n);
            n *= 2 ;
        }
    }
    static void d(int arr[], int n) {
        for(int i = 0; i < n/8; ++i)
            System.out.println(i);
    }
    static void e(int arr[], int n){
        for(int i = 0; i < n; ++i)
            System.out.println(i);
    }
    static void f(int arr[], int n, int k){
        if (k >= n/3) return;
        System.out.println(arr[k]);
        f(arr, n, k + 1);
    }
    static void g(int n){
        int cont = 0;
        for(int i = 0; i < n; ++i){
            for(int j = i; j < n; ++j){
                for(int k = 1; k < n; k *= 2){
                    System.out.println(cont);
                }
            }
        }
    }
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
    }
    public static void main(String[] args) {
    }
}