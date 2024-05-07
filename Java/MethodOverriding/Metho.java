
    
    class A{
        void EmployeeSal(){
            int empid=120;
            int empsal=4125;
            int empbonus=234;

            System.out.println("Previous CTC");
            System.out.println(empid);
            System.out.println(empsal);
            System.out.println(empbonus);
        }

    }
    class B extends A{
        void EmployeeSal(){
            super.EmployeeSal();
            int empsal=4524;
            int empbonus=524;

            System.out.println("New CTC");
            System.out.println(empsal);
            System.out.println(empbonus);
        }
    }
public class Metho{
    public static void main(String[] args) {
        A obj=new A();
        obj.EmployeeSal();
    }
}
