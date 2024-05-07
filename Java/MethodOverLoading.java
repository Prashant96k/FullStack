public class MethodOverLoading {
    static int add(int a,int b){
        int sum =a+b;
        return sum;

    }
    static int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
        
    }
    public static void main(String[] args) {
        int add1=add(4,5);
        System.out.println(add1);
    }
}
