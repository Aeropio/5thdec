import java.io.*;
// Java program to print largest contiguous array sum
import java.util.*;
 
class Kadane
{
    public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
    }
 
    static int maxSubArraySum(int a[])
    {
        // int size = a.length;
        // int max_so_far = 0, max_ending_here = 0;
 
        // for (int i = 0; i < size; i++)
        // {
        //     max_ending_here = max_ending_here + a[i];
        //     System.out.println("i is   "+i+"...max ending value is  "+max_ending_here);
        //     if (max_ending_here < 0)
        //         max_ending_here = 0;
        //     if (max_so_far < max_ending_here)
        //         max_so_far = max_ending_here;
        // }
        // return max_so_far;
        int sum=0,maxSubarray=0;
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
            if(sum<0){
                sum =0;
            }
            else if(sum>maxSubarray){
                maxSubarray = sum;
            }
        }
        return maxSubarray;
    }
    
}