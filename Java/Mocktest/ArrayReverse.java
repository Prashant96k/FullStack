package Mocktest;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[n-i-1];
            System.out.print(arr1[i]+" ");
        }


        }
    }
    

