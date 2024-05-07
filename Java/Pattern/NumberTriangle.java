package Pattern;

public class NumberTriangle {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=n; j>n-i; j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
