package Pattern;

public class PalindromTriangle {
    public static void main(String[] args) {
        int rows = 6;
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Two spaces for better alignment
            }
            
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Print numbers in increasing order excluding 1
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}
