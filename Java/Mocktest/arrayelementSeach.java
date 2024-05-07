package Mocktest;
import java.util.Scanner;

public class arrayelementSeach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={4,8,9,7,9,9};
        int n=arr.length;
        System.out.println("Enter the element to find");
        int num=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
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
    }
}
