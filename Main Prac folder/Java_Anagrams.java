/**
 * Java_Anagrams
 */
import java.util.Scanner;
import java.util.Arrays;

public class Java_Anagrams {

    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char arr[] = s2.toCharArray();
        Arrays.sort(arr);
        // s2 = new String(arr);
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        // s1 = new String(arr1);
        // System.out.println(s1 + " " + s2);
        boolean ans = true;
        if (s1.length() != s2.length())
            System.out.println("Not Anagrams");
        else {
            for (int i = 0; i < s1.length(); i++) {
                if (arr1[i] != arr[i]) {
                    ans = false;
                    break;
                }

            }
            if (ans)
                System.out.println("Anagrams");
            else
                System.out.println("Not Anagrams");
        }

    }
}