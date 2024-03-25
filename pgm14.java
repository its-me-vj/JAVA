import java.util.Scanner;

public class pgm14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String Str = sc.nextLine();

        // String Class Methods
        System.out.println("\nString Class Methods:");
        System.out.println("Original String: " + Str);
        System.out.println("Length of String: " + Str.length());
        System.out.println("Substring from index 2 to end: " + Str.substring(2));
        System.out.println("Index of 'e': " + Str.indexOf('e'));
        System.out.println("Uppercase: " + Str.toUpperCase());
        System.out.println("Lowercase: " + Str.toLowerCase());
        System.out.println("Contains 'world': " + Str.contains("world"));

        // StringBuffer Class Methods
        System.out.println("\nStringBuffer Class Methods:");
        StringBuffer stringBuffer = new StringBuffer(Str);
        System.out.println("Original StringBuffer: " + stringBuffer);
        stringBuffer.append(" - Java"); // append
        System.out.println("After append: " + stringBuffer);
        stringBuffer.insert(5, " is awesome"); // insert
        System.out.println("After insert: " + stringBuffer);
        stringBuffer.delete(10, 16); // delete
        System.out.println("After delete: " + stringBuffer);
        stringBuffer.reverse(); // reverse
        System.out.println("After reverse: " + stringBuffer);
        stringBuffer.replace(5, 12, "rocks"); // replace
        System.out.println("After replace: " + stringBuffer);

        sc.close();
    }
}

