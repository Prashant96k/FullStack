import java.util.Scanner;
public class Calcultorifelsestatement {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your Operation: 1--Addition ;2:Substraction ; 3:Multiplication; 4:Division; 5:Mod; ");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println(a+b);
        }
        else if(choice==2){
            System.out.println(a-b);
        }
        else if(choice==3){
            System.out.println(a*b);
        }
        else if(choice==4){
            if(b==0){
                System.out.println("Number cannot devided by zero");
            }
            else{
            System.out.println(a/b);
            }
        }
        else if(choice==5){
            System.out.println(a%b);
        }else{
            System.out.println("Wrong Choice");
        }

    }


    }

