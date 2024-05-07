package Pattern;

public class PattenNleft {
    public static void main(String[] args) {
        int rows = 6;
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print asterisks
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
