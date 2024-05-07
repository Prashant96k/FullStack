import java.util.Scanner;

public class averageStd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        float studentaverage=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            num=sc.nextInt();
           // System.out.println(num);
            studentaverage=studentaverage+num;

        }
        System.out.println("The sum of Student Marks = " +studentaverage);

        System.out.println("The average Total marks  =  " +studentaverage/n);

    }
    
}
