import java.util.*;
class Prime{
    void prime()
    {
        int num,flag=0,i;
        System.out.println("Enter a number to check whether a number is prime or not");
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
          
         for(i=2;i<=num/2;i++)
         {
             if(num%i==0)
             {
                  flag=1;
                  break;
             }
         }
            
            if(flag==1 || num==0 || num==1){
                 System.out.println(" Not a Prime number");
             }
             else{
                  System.out.println("Prime number");
             }
             
    }
}
public class Main{
public static void main(String[]args)
{
Prime obj=new Prime();
obj.prime();
}
}