package homework;
import java.util.Scanner;

public class arithmatec {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value of a");
        a=sc.nextInt();
        System.out.println("Enter The Value of b");
        b=sc.nextInt(); 
        System.out.println("Addition "+ (a+b));
        System.out.println("Substraction "+ (a-b));
        System.out.println("Division "+ (a/b));
        System.out.println("Multiplication "+ (a*b));
        System.out.println("Modulo5 "+ (a%b));

    }
}
