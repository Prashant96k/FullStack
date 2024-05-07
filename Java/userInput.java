import java.util.Scanner;

public class userInput {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a; //Declaration
        System.out.println("Enter The Value of a");
        a=sc.nextInt(); //intialization
        System.out.println("The value of a is " +a);
        float b;
        
        System.out.println("Enter The Value of b");
        b=sc.nextFloat();
        System.out.println("The value of a is " +b);
    }
}