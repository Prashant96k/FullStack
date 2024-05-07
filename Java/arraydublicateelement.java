import java.util.Scanner;

public class arraydublicateelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={22,45,67,23,34,22};
        for(int i=0;i<arr.length-1;i++ ){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }


        }
    }
    
}
