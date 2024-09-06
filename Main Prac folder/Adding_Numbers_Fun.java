/**
 * Adding_Numbers_Fun
 */
import java.util.Scanner;
public class Adding_Numbers_Fun {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int rem=0;
        int mod=0;
        int sum=0;
        while(n>=1)
        {
            rem=n%10;
            n=n/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }
}