package Mocktest;

public class ArrayEvenOddSum {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int evensum=0;
        int oddnsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evensum=evensum+arr[i];
                System.out.print(arr[i]+ " ");
                  
                
            }else{
                oddnsum=oddnsum+arr[i];
            }
                
            }System.out.println(evensum);
            System.out.println(oddnsum);
            }
        }
    

