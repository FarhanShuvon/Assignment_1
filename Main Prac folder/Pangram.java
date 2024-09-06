import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         * 
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] frq = new int[200];
        for (int i = 0; i < str.length(); i++) {
            frq[str.charAt(i)]++;
        }
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            {
                ans = ans + frq[str.charAt(i)];
            }

        }
        if (ans == 26)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
