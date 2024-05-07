package Constructor;

public class VehichleClass {
    String color;
    int no;
    String name;
    String Type;

    VehichleClass(String color1,int no1,String name3,String Type1 ){
        color=color1;
        no=no1;
        name=name3;
        Type=Type1;

    }
    void NameType(){
        System.out.println("name= "+name+"  Type= "+Type);
    }
    void NoColor(){
        System.out.println("no= "+no+  "color = "+color);
    }
    public static void main(String[] args) {
        VehichleClass obj1=new VehichleClass("Blue", 1234, "Bolero","4X4");
        obj1.NameType();
        obj1.NoColor();
        VehichleClass obj2=new VehichleClass("Yellow", 8756, "Scorpio","4X2");
        obj2.NameType();
        obj2.NoColor();
        VehichleClass obj3=new VehichleClass("Black", 4598, "Ennovaa","4X2");
        obj3.NameType();
        obj3.NoColor();
        VehichleClass obj4=new VehichleClass("White", 1254, "Fortuner","4X4");
        obj4.NameType();
        obj4.NoColor();
    }

    
}
