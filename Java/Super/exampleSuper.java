package Super;
class A12{
    String name="Prashant k";
void PrintName(){
 
System.out.println(name);
}
}
class B extends A12{
String name="Avinsh Landaae";
void PrintName(){
    System.out.println(super.name);
}
}


public class exampleSuper {
    public static void main(String[] args) {
        B obj=new B();
        obj.PrintName();
    }
}
