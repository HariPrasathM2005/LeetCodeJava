import java.util.*;
import java.io.*;
public class TargetIndices2089
{
    public static List<Integer> targetIndices(int[] nums, int target) 
    {
        List<Integer> res=new ArrayList<>();
        int i=0;
        while(i<nums.length-1)
        {
            if(nums[i]>nums[i+1])
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
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int[] nums1={1,2,5,2,3};
        int[] nums2={1,2,5,2,3};
        int[] nums3={1,2,5,2,3};
        List<Integer> res=targetIndices(nums3, 5);
        System.out.println(res);
    }
}
