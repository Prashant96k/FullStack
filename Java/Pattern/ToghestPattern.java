package Pattern;

public class ToghestPattern {
    public static void main(String[] args) {
        int rows = 6;
        
        // Upper triangle
        for (int i = 1; i <= rows; i++) {
            // Print left half asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Print spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            
            // Print right half asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // Lower triangle
        for (int i = rows; i >= 1; i--) {
            // Print left half asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Print spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            
            // Print right half asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
