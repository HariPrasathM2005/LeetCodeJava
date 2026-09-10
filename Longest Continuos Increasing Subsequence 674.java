public class LongestContinuosIncreasingSubsequence674
{
    public static int findLengthOfLCIS(int[] nums) 
    {
        int res=1;
        int max=0;
        int i=0;
        while(i<nums.length)
        {
            if(i+1<nums.length && nums[i]<nums[i+1])
            {
                res=res+1;
            }
            else if(i+1<nums.length && nums[i]>=nums[i+1])
            {
                if(max<res)
                    max=res;
                System.out.println(res);
                res=1;
            }
            i=i+1;
        }
        if(max<res)
            max=res;
        return max;
    }
    public static void main(String[] args) 
    {
        int[] nums={1,3,5,4,7,8,9};    
        int res=findLengthOfLCIS(nums);
        System.out.println(res);
    }
}
