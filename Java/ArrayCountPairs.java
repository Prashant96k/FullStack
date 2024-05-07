import java.util.Scanner;

public class ArrayCountPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,5,6,1,7};
        System.out.println("Enter the number to find the sum");
        int num=sc.nextInt();
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==num){
                    System.out.print(arr[i]+ " "+arr[j]);

                }

            }
            System.out.println();

            }
        }

    }

