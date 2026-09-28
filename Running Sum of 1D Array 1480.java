public class RunningSum1480 
{
    public static int[] runningSum(int[] nums) 
    {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
    public static void Display(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[] nums1={1,2,3,4};
        int[] nums2={1,1,1,1,1};
        int[] res=runningSum(nums2);
        Display(res);
    }    
}
