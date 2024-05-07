package Abstraction;

/**
 * InterfaceExample
 */
 interface newCar {
    void Break();
    void Gear();
    void Button();

 }
    
    class CarFunNew implements newCar{
        public void Break(){
            System.out.println("Break");
        }
        public void Gear(){
            System.out.println("Gear");
        }
        public void Button(){
            System.out.println("Button");
        }
    }
    public class InterfaceExample {
    
        public static void main(String[] args) {
            newCar obj=new CarFunNew();
            obj.Break();
            obj.Button();
            obj.Gear();
        }
    }

