// Java program to find missing Number

import java.util.*;
import java.util.Arrays;

class GFG {

    // Function to find the missing number
    public static int getMissingNo(int[] nums, int n)
    {
       int sum = 0;
        for(int i=1;i<=n+1;i++){
            sum = sum + i;
        }
         for(int i=0;i<n;i++){
            sum = sum - nums[i];
        }
        return(sum);
       // return ((n * (n+1))/2 - sum);
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 1,5,2,3 };
        int N = arr.length;
        System.out.println(getMissingNo(arr, N));
    }
}