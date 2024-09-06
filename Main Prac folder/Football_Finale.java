/**
 * Football_Finale
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;
public class Football_Finale {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String str=sc.nextLine();
            mp[str[i]]++;
        }

    }
}