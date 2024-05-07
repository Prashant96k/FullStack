package Practice;
import java.util.*;
class Area{
    void setDim(int l,int b){
        System.out.println();

    }
    int getArea(int l,int b){
        int result=l*b;
        return result;

    }
}

public class MethodRectangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Area obj=new Area();
        setDim(a,b);
        System.out.println(obj.getArea(l,b));
    }

}
