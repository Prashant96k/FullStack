public class MathOperationsPrashant {
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double cubeRoot(double num) {
        return Math.cbrt(num);
    }

    public int factorial(int num) {
        if (num < 0) {
            System.out.println("you entered negative number");
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public long factorial(long num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long result = 1;
        for (long i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        System.out.println("Square Root of 16: " + mathOperations.squareRoot(16));

        System.out.println("Cube Root of 27: " + mathOperations.cubeRoot(27));

        
        System.out.println("Factorial of 5: " + mathOperations.factorial(5));

        System.out.println("Factorial of 20: " + mathOperations.factorial(20L));
    }
}
