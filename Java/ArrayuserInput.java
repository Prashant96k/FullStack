import java.util.Scanner;

public class ArrayuserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int evenSum=0;
        int oddSum=0;
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
                evenSum=evenSum+arr[i];
            }else{
                oddSum=oddSum+arr[i];
            }
        }System.out.println(evenSum);
        System.out.println(oddSum);
        int m=arr.length;
        System.out.println("Enter the element to find");
        int num=sc.nextInt();
        boolean found=false;
        for(int i=0;i<m;i++){
            if(num==arr[i]){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
          
        // for(int i=0;i<n;i++){

        //     System.out.print(arr[i]+" ");
        // }System.out.println();
    }
}
