/**
 * Programming_Camp
 */
import java.io.*;
import java.util.*;
public class Programming_Camp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        
        List<String> str = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            str.add(s);
        }
        
        Collections.reverse(str);
        
        int t = n - a;
        
        for (int i = 0; i < t; i++) {
            System.out.println(str.get(i));
        }
        
        scanner.close();
    }
}
