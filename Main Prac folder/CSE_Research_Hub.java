
/**
 * CSE_Research_Hub
 */
import java.io.*;
import java.util.*;

public class CSE_Research_Hub {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int t = obj.nextInt();
            if (t == 1)
                cnt++;
        }
        System.out.println(cnt);
    }
}