package Abstraction;

interface newCar {
    void Break();
    

 }
 interface newCar1 {
    void Gear();
    

 }
    
    class CarFunNew implements newCar,newCar1{
        public void Break(){
            System.out.println("Break");
        }
        public void Gear(){
            System.out.println("Gear");
        }
       
    }




public class MultipleInheriance {
    public static void main(String[] args) {

        CarFunNew obj=new CarFunNew();
        obj.Break();
        obj.Gear();
    }
}
