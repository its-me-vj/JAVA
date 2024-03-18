import java.util.Arrays;
import java.util.Scanner;

public class pgm12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine(); // Use nextLine() to read the entire line
        char[] ar = str.toCharArray(); // Correct the variable name
        Arrays.sort(ar); // Use Arrays.sort() instead of Array.sort()
        String sortedStr = new String(ar); // Correct the variable name
        System.out.println("Sorted String: " + sortedStr);
    }
}

