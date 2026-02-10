import java.util.*;
import java.io.*;
public class RemoveElement 
{
    public static void Display(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static int RemoveElement(int[] nums,int val)
    {
        int length=nums.length;
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            if(val==nums[i])
            {
                length=length-1;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(val==nums[i])
            { 
       
                for(int j=i;j<nums.length;j++)
                {
                    if(val!=nums[j])
                    {
                        temp=nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                    }
                }
                
            }
            
            
        }
        Display(nums);
        return length;
    }
    public static void main(String[] args) 
    {
        int[] arr=new int[4];
        int res;
        arr[0]=3;
        arr[1]=2;
        arr[2]=2;
        arr[3]=3;
        res=RemoveElement(arr,3);
        System.out.println(res);
    }
}
