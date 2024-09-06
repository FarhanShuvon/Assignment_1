
/**
 * The_Lost_Expedition_Journal
 */
import java.util.Scanner;

import java.util.Arrays;

public class The_Lost_Expedition_Journal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = 0;
            if (sc.hasNextInt())
                n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt())
                    arr[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] ar = new int[m];
            for (int i = 0; i < m; i++) {
                ar[i] = sc.nextInt();
            }
            // Arrays.sort(arr);
            Arrays.sort(ar);
            for (int num : arr)
                System.out.print(num + " ");
            System.out.println();
            for (int g : ar)
                System.out.print(g + " ");
            System.out.println();
        }
    }
}