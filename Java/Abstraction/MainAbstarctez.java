package Abstraction;
abstract class car{
     abstract void Button();
     abstract void Break();
     abstract void Gear();
    void Name(){
        System.out.println("This is car class");
    }
}
class CarFun extends car{
    void Button(){
        System.out.println("Car will sTARt");
    }
    void Break(){
        System.out.println("Break");
    }
    void Gear(){
        System.out.println("Break is changing");
    }
}
public class MainAbstarctez{
    public static void main(String[] args) {
        car obj=new CarFun();
        obj.Break();
        obj.Button();
        obj.Gear();
        obj.Name();
    }
}
    

