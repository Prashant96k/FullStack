public class arrayswap {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,8,9};
        int n=arr.length;
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];

        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
