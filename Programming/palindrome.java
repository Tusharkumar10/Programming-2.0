import java.util.*;
class Palindrome
{
    void pal()
    {
        System.out.println("Enter a string to check whether a string is palindrome or not");
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int strLength=str.length();
        String revstr="";
        for(int i=(strLength-1);i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        if(str.toLowerCase().equals(revstr.toLowerCase()))
        {
             System.out.println(str+" is a Palindrome string"); 
        }
        else
        {
            System.out.println(str+" is not a Palindrome string");
        }
            
         
    }
}

public class Main{
public static void main(String[]args)
{
Palindrome obj=new Palindrome();
obj.pal();
}
}