
/**
 * check
 */
import java.util.Scanner;

public class check {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int t = myObj.nextInt();
        int []arr=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=myObj.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}