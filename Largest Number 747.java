import java.util.*;

public class LargestNumber747
{
    public static int dominantIndex(int[] nums)
    {
        int i=0,temp;
        int[] Nums=Arrays.copyOf(nums, nums.length);
        while(i<nums.length-1)
        {
            if(nums[i]<nums[i+1])
            {
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }
        if(nums[0]>=(nums[1]*2))
        {
            for(int j=0;j<Nums.length;j++)
            {
                if(nums[0]==Nums[j])
                    return j;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] nums={3,6,1,0};
        int res=dominantIndex(nums);
        System.out.println(res);
    }
}
