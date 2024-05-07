import java.util.Scanner;

public class arrayEvenorOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={2,4,6,7,8,9};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(+arr[i]+" ");
            }
        }
    }
    
}
