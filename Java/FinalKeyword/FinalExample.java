package FinalKeyword;

public class FinalExample {
    final int num3=90;
    public static void main(String[] args) {
       FinalExample obj=new FinalExample();
       obj.num3=900; ///The final field FinalExample.num3 cannot be assigned
        System.out.println(obj.num3);

    }
}
