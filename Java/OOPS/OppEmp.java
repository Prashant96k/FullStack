package OOPS;
class Employee{
    String name="Prashant Kadam";
    int Salary=10000;
    int id=1234;
    void FullDetails(){
        System.out.println(name +" "+ Salary +" " +id);
    }
}

public class OppEmp {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.FullDetails();
    }
}
    

