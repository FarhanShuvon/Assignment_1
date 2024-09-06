
/**
 * Check_Unique_Year
 */
import java.util.Scanner;

public class Check_Unique_Year {

    public static void main(String[] args) {
        String str;
        Scanner obj = new Scanner(System.in);
        str = obj.nextLine();
        Boolean ans = false;
        // System.out.println(str);
        // System.out.println(str.length());
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j])
                    ans = true;
            }
        }
        if (ans)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}