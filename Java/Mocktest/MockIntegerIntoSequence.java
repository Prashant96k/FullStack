package Mocktest;

import java.util.Scanner;

public class MockIntegerIntoSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to break");
        int num=1234567;
        int a1=num%10;
        num=num/10;
        int b1=num%10;
        num=num/10;
        int c1=num%10;


       
         
        System.out.println(c1+" "+b1 +" "+a1);
         

    }
    
}
