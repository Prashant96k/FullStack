package MethodOverriding;

 class A {
    void Printname(){
        System.out.print("My name is Prashant ");
    }
}
    class B extends A{
        void Printname(){
            super.Printname();
            System.out.println("  kadam");

        }

    
    }
    public class MehodOverringexample{

        public static void main(String[] args) {
            B obj =new B();
            obj.Printname();
        }
    }

