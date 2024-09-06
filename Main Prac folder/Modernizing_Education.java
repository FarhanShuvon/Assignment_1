
/**
 * Modernizing_Education
 */
import java.util.Scanner;

public class Modernizing_Education {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k;
        int gc = 0;
        int wp = 0;
        int tele = 0;
        for (int i = 0; i < n; i++) {
            k = obj.nextInt();
            if (k == 1)
                gc++;
            else if (k == 2)
                wp++;
            else if (k == 3)
                tele++;

        }

        if (gc > wp && gc > tele)
            System.out.println("Google Classroom");
        else if (wp > gc && wp > tele)
            System.out.println("WhatsApp");
        else if (tele > wp && tele > gc)
            System.out.println("Telegram");
        else {
            if (gc == 0) {
                if (wp == tele)
                    System.out.println("TIE");
            } else if (tele == 0) {
                if (wp == gc)
                    System.out.println("TIE");
            } else if (wp == 0) {
                if (tele == gc)
                    System.out.println("TIE");
            } else
                System.out.println("TIE");
        }
    }
}