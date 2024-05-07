package Mocktest;
import java.util.Scanner;

public class MockConvertMinutesINToYearsandDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Minutes");
        long Minutes=sc.nextInt();
        long minInYear=60*24*365;
        long years=Minutes/minInYear;
        long remainingMin=Minutes%minInYear;
        long days=remainingMin/(60*24);
        System.out.println(years+" years "+days+" Days ");
    }
}
