import java.util.*;
import java.io.*;
public class MaximumProduct1464
{
    public static int maxProduct(int[] nums) 
    {
        int i=0;
        while(i<nums.length-1)
        {
            if(nums[i]<nums[i+1])
            {
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }    
        return (nums[0]-1)*(nums[1]-1);
    }
    public static void main(String[] args) 
    {
        int[] nums1={3,4,5,2};
        int[] nums2={1,5,4,5};
        int res=maxProduct(nums2);
        System.out.println(res);
    }
}
