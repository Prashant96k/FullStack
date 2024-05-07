package Statickeyword;
class Students{
    int roll;
    String name;
   static String College="ITS";

    Students(int roll,String name){
    this.roll=roll;
    this.name=name;
    }
    void PrintDataa(){
        System.out.println(roll+ "\n"+name+"\n"+College);
    }
}
public class Statickeywordexample {
    public static void main(String[] args) {
        Students obj=new Students(14, "Prashant");
        obj.PrintDataa();
        
    }
    
}
