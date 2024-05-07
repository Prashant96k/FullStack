import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();

        System.out.println("Enter your Choice 1:Addition 2:Substraction 3:Division 4:Multiplication");

        int choice=sc.nextInt();
        switch (choice) {
            case 1 :System.out.println(a+b);
                    break;
            case 2:System.out.println(a-b);
                      break;
            case 3:System.out.println(a/b);
                    break;
            case 4:  System.out.println(a*b);
                   break;
        default:System.out.println("wrong choice");
        }
    }
    
}
