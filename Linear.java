import java.io.*;
import java.util.*;
public class Linear
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
        int res=linearsearch(nums,target);
        if(res!=-1)
        System.out.println("element found at"+res+"index");
        else
        System.out.println("elemnt not found");
        System.out.println("time complexity: O(n)");
        

    }
    public static int linearsearch(int nums[],int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            return i;

        }
        return -1;
    }
    
}