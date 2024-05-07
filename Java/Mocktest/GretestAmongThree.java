package Mocktest;

import java.util.Scanner;

public class GretestAmongThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        if(a>b && a>c){
            System.out.println("A greter");
        }else if(b>c)
        {
          System.out.println("B is Greater");
        }else{
            System.out.println("C is greter");
        }
    }
}
