import java.util.*;
class Factorial
{
    void fact()
    {
        System.out.println("Enter a number to find the factorial");
        Scanner sc=new Scanner(System.in);
        int num,facto=1;
        num=sc.nextInt();
        for(int i=num;num>0;num--)
        {
            facto=facto*num;
        }
        System.out.println("Factorial = "+facto);
    }
}

public class Main{
public static void main(String[]args)
{
Factorial obj=new Factorial();
obj.fact();
}
}