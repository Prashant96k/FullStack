package Super;
class A{
    int x;
    int y;
    A(int x,int y){
        this.x=x;
        this.y=y;


    }
}
class B1 extends A{
    int c;
    B1(int x,int y,int c){
        super(x, y);
        this.c=c;

        
    }
    void PrintVariabl(){
        System.out.println(x+" "+y+" "+c);
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        B1 obj=new B1(5, 6, 7);
        obj.PrintVariabl();
    }

    
}
