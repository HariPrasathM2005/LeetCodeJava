import java.util.*;
public class MonotonicArray896 
{
    public static boolean isMonotonic(int[] nums) 
    {
        boolean inc=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                inc=true;
                break;
            }
            else if(nums[i]>nums[i+1])
            {
                inc=false;
                break;
            }
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(inc)
            {
                if(nums[i]>nums[i+1])
                {
                    return false;
                }
            }
            else
            {
                if(nums[i]<nums[i+1])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int[] arr={2,2,1,0};
        boolean Res=isMonotonic(arr);
        System.out.println(Res);
    }
    
}
