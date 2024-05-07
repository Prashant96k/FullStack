package Pattern;

public class ZeroOnealternative {
    public static void main(String[] args) {
        

    
        int rows = 6;
        
        for (int i = 0; i < rows; i++) {
            int num = i % 2 == 0 ? 1 : 0; 
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num == 1 ? 0 : 1; 
            }
            System.out.println();
    
}
}
}
