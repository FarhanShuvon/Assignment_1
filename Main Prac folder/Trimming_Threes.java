/**
 * Trimming_Threes
 */
import java.io.*;
import java.util.*;
public class Trimming_Threes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n != 3) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
