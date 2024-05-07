import java.util.Scanner;
public class evenoddsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
               even=even+num;
              // System.out.println("even number sum"+even);

            }else{
                odd=odd+num;
               
            }
        }System.out.println("even number sum= "+even);
         System.out.println("odd numbers sum= "+odd);
    }
    
}
