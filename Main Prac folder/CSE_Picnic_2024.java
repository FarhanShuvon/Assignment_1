
/**
 * CSE_Picnic_2024
 */
import java.util.Scanner;

public class CSE_Picnic_2024 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            int a;
            a = obj.nextInt();
            arr1[i] = obj.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 20)
                cnt++;
        }
        if (cnt < 2)
            System.out.println("No gift sections");
        else {
            int mx1 = 0;
            int mx2 = 0;
            for (int i = 0; i < n; i++) {
                if (arr1[i] > mx1)
                    mx1 = arr1[i];
            }
            for (int i = 0; i < n; i++) {
                if (arr1[i] != mx1) {
                    if (arr1[i] > mx2)
                        mx2 = arr1[i];
                }
            }
            System.out.println(mx1+" "+mx2);
        }

    }
}