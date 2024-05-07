public class MethodOverLoadingProductofSum {
    int product(int a,int b){
        int prdct=a*b;
        return prdct;
    }
    float  product(float a,float b){
        float prdct1=a*b;
        return prdct1;
    }
    public static void main(String[] args) {
        MethodOverLoadingProductofSum md = new MethodOverLoadingProductofSum();
        int a = md.product(3, 4);
        float b = md.product(4.2f, 4.2f);
        System.out.println(a);
        System.out.println(b);
    }
}
