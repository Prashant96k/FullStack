package OOPS;
import Practice.*;

class AccessModfiers {
    int x=10;
    void PrintName(){
        System.out.println("Prashat");
    }
}
public class Main{
    public static void main(String[] args) {
        AccessModfiers obj1=new AccessModfiers();
        System.out.println(obj1.x);
        
    }
}
