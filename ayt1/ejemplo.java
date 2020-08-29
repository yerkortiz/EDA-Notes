
class Main {
    static int suma1(int n){
        return (n * (n + 1))/2; // O(1)
    }
    static int suma2(int n){
        int sum = 0;
        for(int i = 1; i <=n; ++i)
            sum += i;
        return sum; //O(N)
    }
    static int suma3(int n){
        int sum = 0;
        for(int i = 1; i <= n; ++i) 
            for(int j = 1; j <= i; ++j) 
                ++sum;
        return sum;//O(N^2)
    }
    public static void main(String[] args) {
        System.out.println(suma1(10));
        System.out.println(suma2(10));
        System.out.println(suma3(10));
    }
}