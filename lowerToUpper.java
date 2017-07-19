import java.io.*;
import java.util.*;
public class lowerToUpper {
    public static void main(String args[])
    {
        String str;
        Scanner s=new Scanner(System.in);
        str=s.next();
        char p = 0;
        
        for(int i=0;i<str.length();i++)
        {
             p=str.charAt(i);
        
            if(Character.isUpperCase(p))
            {
                System.out.print(Character.toLowerCase(p));
            }
            else
            {
                System.out.print(Character.toUpperCase(p));
            }
         }
    }
    
}
