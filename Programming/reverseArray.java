import java.util.*;
class HelloWorld {
    public static void main(String[] args)
    {
        int [] arr=new int[]{0,1,2,3,4,5,6,7,8,9};
       
        int i;
        int len=arr.length;
         
        int temp;
        
        for(i=0;i<(len/2);i++)
        {
            temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
        System.out.println("Reverse array");
        for(i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
/* 
 int [] arr2=new int[20];
        Scanner sc=new Scanner(System.in);
for(i=0;i<len;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Entered Array");
         for(i=0;i<len;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("");  */
