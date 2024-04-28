import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,0,5,0,4,0,6};
         int[] arr2=new int[8];
        int i,j,temp=0,count=0;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         for(i=arr.length-1,j=0;i>0;i--,j++)
         {
             if(arr[i]==0)
             {
                 arr2[j]=0;
                 
                 count++;
             }
             
         }
          for(i=count,j=0;i<arr.length;i++,j++)
          {
              arr2[i]=arr[j];
          }
         
        
        for(i=0;i<arr.length;i++)
        {
             System.out.print(arr2[i]+" ");
        }
       
    }
}