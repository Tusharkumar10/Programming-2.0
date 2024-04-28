import java.util.*;
class Armstrong{
    void arm(){
        System.out.println("Enter a number to check whether a given number is armstrong or not");
        Scanner sc=new Scanner(System.in);
        int num,temp,rem,sum=0;
        num=sc.nextInt();
        temp=num;
        while(temp!=0)
        {
        rem=temp%10;
        sum=sum+rem*rem*rem;
        temp=temp/10;
        }
        if(sum==num)
        {
             System.out.println("Armstrong number");
        }
        else{
             System.out.println("Not a Armstrong number");
        }
        
        
        
    }
}

public class Main{
public static void main(String[]args)
{
Armstrong obj=new Armstrong();
obj.arm();
}
}