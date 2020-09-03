import java.io.*; 
import java.util.*; 
class NuevaEstructura{
    Stack<Integer> S1 = new Stack<Integer>();
    Stack<Integer> S2 = new Stack<Integer>();
    public void Queue(int elemento){
        this.S1.push(elemento);
    }
    public int Dequeue(){
        if (this.S2.isEmpty()){
            while(!this.S1.isEmpty()){
                this.S2.push(this.S1.pop());
            }
            return this.S2.pop();
        } else {
            return this.S2.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> S1 = new Stack<Integer>();
        Stack<Integer> S2 = new Stack<Integer>();
        int[] arr = {1, 2, 3, 4};
        for(int i = 0; i < 4; ++i){
            S1.push(arr[i]);
        }
        for(int i = 0; i < 4; ++i){
            S2.push(S1.pop());
        }
        for(int i = 0; i < 4; ++i){
            System.out.print(S2.pop() + " ");
        }
    }
}