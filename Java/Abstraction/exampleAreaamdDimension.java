package Abstraction;

abstract class Shape{
    abstract void dimension();
    abstract void area();
    
}
class Circle extends Shape{
    @Override
    void dimension() {
        int l=30;
        int b=40;
        System.out.println(l*b);
    }
    void area(){
        int r=30;
        int pi=3;
        System.out.println(pi*r*r);
    }
}
public class exampleAreaamdDimension {
    public static void main(String[] args) {
        Shape obj=new Circle();
        obj.area();
        obj.dimension();
    }

    
}