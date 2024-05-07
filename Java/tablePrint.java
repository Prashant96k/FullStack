import java.util.Scanner;
public class tablePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Table you have to Print");
        int Table=sc.nextInt();
        for(int i=1;i<=10;i++){

            System.out.println(Table*i);
        }
    }

    
}
