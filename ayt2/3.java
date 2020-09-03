import java.util.*;
class Prefix{
    
    static boolean isOperator(char x){ 
        switch(x){ 
          case '+': 
          case '-': 
          case '/': 
          case '*': 
            return true; 
        } 
      return false; 
    } 
      
    static String prefixToInfix(String prefix_exp) { 
      Stack<String> s= new Stack<String>();
      
      int l = prefix_exp.length(); 
      
      for(int i = l-1; i >= 0; i--){ 
      
        if(isOperator(prefix_exp.charAt(i))){ 
      
          String op1 = s.peek();   
          s.pop(); 
          String op2 = s.peek();   
          s.pop(); 
      
          String temp = "(" + op1 + prefix_exp.charAt(i) + op2 + ")"; 
      
          s.push(temp); 
        } 
      
        else{ 
          s.push(prefix_exp.charAt(i)+""); 
        } 
      } 
      
      return s.peek(); 
    } 
      
    public static void main (String[] args){
        
    String prefix_exp = "*-A/BC-/ADE"; 
    System.out.println("Infix : "+prefixToInfix(prefix_exp));
    
  }
}