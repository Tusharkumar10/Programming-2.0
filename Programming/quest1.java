import java.util.*;
public class Exam
{
 public static void main(String[]args)
 {
     int temp;
     int[] arr=new int[]{1,2,3,0,0,5,6,0};
      
for(int i=0;i<arr.length-1;i++) 
{    
for(int k=0;k<arr.length-1;k++)
{
           // First i will sort the array
if(arr[k]<arr[k+1])
{
temp=arr[k];
arr[k]=arr[k+1];
arr[k+1]=temp;
}
}}
 for(int i=0;i<arr.length-1;i++)
 {
     System.out.print(arr[i]+" ");
 }
 System.out.println();
     
     for(int i=0;i<arr.length-1;i++) {
         if(arr[arr.length-i-1]==0)
         {
         System.out.print(arr[arr.length-i-1]+" ");
         }
         else if(arr[arr.length-i-1]!=0)
         {
              System.out.print(arr[arr.length-i-1]+" ");
         }
         else
         {
             System.out.print("");
         }
     }
 }
    
}