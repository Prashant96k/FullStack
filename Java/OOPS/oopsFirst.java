package OOPS;

public class oopsFirst {
    int num=34;
    int age=100;
    String name="Hello world";//attribute
    void PrintName(){              //method
        System.out.println("Prashant kadam");
    }
    public static void main(String[] args) {
        oopsFirst obj1=new oopsFirst();
        oopsFirst obj2=new oopsFirst();
        obj1.num=50;
        System.out.println("number "+obj1.num);
        System.out.println("number "+obj2.num);
    }
}
