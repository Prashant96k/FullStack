public class MethodsFirst {
    static void Swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+ " "+b);
    }
    public static void main(String[] args) {
        Swap(4,5);
        Swap(6, 8);
        
    }
        
    }

