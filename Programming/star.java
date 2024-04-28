import java.util.*;
class Main
{
    
    void fun()
    {
     for(int i=0;i<5;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    System.out.println("===============================");
    }
    
    void fun2()
    {
     for(int i=0;i<5;i++)
    {
        for(int j=5;j>=i;j--)
        {
           
              System.out.print("*");  
            
       }
        System.out.println("");
    }
     System.out.println("===============================");
    }
    
    void fun3()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=4;j>i;j--)
            {
               System.out.print(" "); 
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*"); 
            }
            System.out.println("");
        }
          System.out.println("===============================");
    }
    
     void fun4()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(" "); 
            }
            for(int k=4;k>=i;k--)
            {
                System.out.print("*"); 
            }
            System.out.println("");
        }
          System.out.println("===============================");
    }
}

public class Star
{
    public static void main(String[]args)
    {
        Main obj=new Main();
        obj.fun();
        obj.fun2();
        obj.fun3();
        obj.fun4();
    }
}