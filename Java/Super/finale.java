package Super;
class A3{
    final float pi=3.14f;

}
class B3 extends A3{
    float pi=90.9f;
}
public class finale {
    public static void main(String[] args) {
        B3 obj=new B3();
        System.out.println(obj.pi);
    }
    
}
