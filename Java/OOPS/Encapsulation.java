package OOPS;

public class Encapsulation {

    
    private int age;
    void setage(int age){
        this.age=age;
        System.out.println("age");
    }
    int getage(){
        return this.age;
    }
        
    
    public static void main(String[] args){
        Encapsulation a=new Encapsulation();
        a.setage(7);
        int var=a.getage();
        System.out.println(var);
    }
}
