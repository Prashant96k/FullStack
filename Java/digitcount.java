import java.util.Scanner;
public class digitcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to find sum and Count");
        int num=sc.nextInt();
        int digit=0;
        int sum=0;
        while (num!=0) {
            sum=sum+num%10;
            num=num/10;
            digit++; 
        }System.out.println("Count of the digit =  "+digit);
        System.out.println("Sum of digits= "+sum);
        

    }
    
}
