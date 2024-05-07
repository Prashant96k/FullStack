import java.util.Scanner;
public class FunctionFactorial {
    
   static int   factorial(int a){
        int fact=1;
        for(int i=1;i<a;i++){
        fact=fact*i;
    
    }return fact;
    
    }
    public static void main(String[] args) {
        int x=factorial(5);

        System.out.println(x);
    }
}
