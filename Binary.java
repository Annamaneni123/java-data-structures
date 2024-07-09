import java.io.*;
import java.util.*;
public class Binary
{
    public static void main(String args[])
    {
        int nums[]=new int[5];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("enter elemnt "+i+":");
            nums[i]=scan.nextInt();
        }
        System.out.println("enter target element:");
        int target;
        target=scan.nextInt();
        int res=Binarysearch(nums,target);
        if(res!=-1)
        System.out.println("element found at "+res+"index");
        else
        System.out.println("elemnt not found");
        System.out.println("time complexity: O(logn)");
    }
    public static int Binarysearch(int nums[],int target)
    {
        int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(nums[m]==target)
            return m;
            else if(target < nums[m]) 
            {
                e=m-1;
            }
            else if(target > nums[m]) 
            {
                s=m+1;
            }
        }
        return -1;
    }
}