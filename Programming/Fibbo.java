import java.util.*;
class Fibbo{
    void fibo(){
    System.out.println("How many numbers you want to print in fibbonacci series");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int num1=0,num2=1,num3=0;
    System.out.print(num1+" "+num2+" ");
    for(int i=2;i<num;i++)
    {
    num3=num1+num2;
    System.out.print(num3+" ");
    num1=num2;
    num2=num3;
    }
    }
}


public class Main{
public static void main(String[]args)
{
Fibbo obj=new Fibbo();
obj.fibo();

}
}