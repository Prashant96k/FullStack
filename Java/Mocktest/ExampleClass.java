package Mocktest;
import java.util.Scanner;;
class Students{
    int rollnumber;
    String Schoolname;
    String studentName;
    char sec;
    Students(int rollnumber1,String SchoolName1,String studntName1,char sec1){
        rollnumber=rollnumber1;
        Schoolname=SchoolName1;
        studentName=studntName1;
        sec=sec1;
    }

 void Details( ){
    
    System.out.println("Student Name = "+studentName);
    System.out.println("SchoolName= " +Schoolname);


}
void Display(){
    System.out.println("RollNumber = "+rollnumber);
    System.out.println("Section = "+sec);
}

    public static void main(String[] args) {
        Students obj1=new Students(25,"Jahss","Prashant",'A');
        obj1.Details();
        
        
        
    }
}
