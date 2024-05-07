public class StringManipulatorPrashant {
    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public String capitalize(String str) {
        return str.toUpperCase();
    }

    public String append(String str1, String str2) {
        return str1 + str2;
    }

    public String append(String str, char ch) {
        return str + ch;
    }

    public String append(String str, int num) {
        return str + num;
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();

        System.out.println("Reverse of 'hello': " + stringManipulator.reverse("hello"));

        System.out.println("Capitalized form of 'hello': " + stringManipulator.capitalize("hello"));

        System.out.println("Append 'hello' and 'world': " + stringManipulator.append("hello", "world"));

        
        System.out.println("Append 'hello' with character '!' : " + stringManipulator.append("hello", '!'));

        System.out.println("Append 'hello' with integer 123 : " + stringManipulator.append("hello", 123));
    }
}
