/**
 * Chocolates_Collection
 */
import java.io.*;
import java.util.*;
public class Chocolates_Collection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        List<String> v = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String str = scanner.next();
            v.add(str);
        }

        Map<String, Integer> mp = new HashMap<>();
        for (String str : v) {
            mp.put(str, mp.getOrDefault(str, 0) + 1);
        }

        int cnt = 0;
        int cn = mp.size();
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1) {
                cnt++;
            }
        }

        System.out.println(cnt);
        System.out.println(cn);

        scanner.close();
    }
}