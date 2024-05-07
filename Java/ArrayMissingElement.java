 class ArrayMissingElement {
    public static void main(String[] args){
        int arr[]={3,4,6,7,8,9};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]!=1){
                System.out.println(arr[i]+1);
            }
        }
    }
}
