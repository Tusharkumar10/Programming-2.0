import java.util.*;
class HelloWorld {
    public static void main(String[] args)
    {
        int [] arr=new int[]{3,1,2,0,4,9,6,7,8,5};
        
        int i=0,min,max;
        int len=arr.length;
         min=arr[i];
         max=arr[i+1];
         
        for(i=0;i<len;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Min and Max in array");
            System.out.println(min+" "+max);
    }
}
