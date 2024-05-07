public class MethodOverloadingGreatestNumber {
    static int Greatest(int a, int b){
        if(a>b){
            System.out.println(a+ " is Greater");
        }else{
            System.out.println(b+ "  is Greater");
        }
        return a;

    }
    static int Greatest(int a, int b,int c){

    if(a>b || a>c){
        System.out.println(a+ " is Greater");
    }
    else if (b>c) 
        
    {
        System.out.println(b+ "  is Greater");
    }
    else{
        System.out.println(c+ "is Greater");
    }
    return a;
}
    public static void main (String args[]){
        int Greatest1=Greatest(5,6);
        int Greatest2=Greatest(1, 3, 4);
    
    }
}
