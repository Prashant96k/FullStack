import java.util.Scanner;

public class arraybasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int studentMarks[] = { 24, 52, 45, 45, 78, 78 };
        System.out.println(studentMarks[4]);


        System.out.println(studentMarks.length); // lenght
        int n = studentMarks.length;
        for (int i = 0; i < n; i++) {
            System.out.print(studentMarks[i]+ " ");//printing the Array
          


        }
        System.out.println();
        int dig=0;
        //Searching an element in array
        System.out.println("Enter the element you have to discover");
        int num=sc.nextInt();
        for(int i=0;i<studentMarks.length;i++){
            if(studentMarks[i]==num){
                System.out.println("Element found =" + i);
                break;
            }
            dig++;
        }
        if(dig==n){
            System.out.println("Element not found");
        }


    }
}
