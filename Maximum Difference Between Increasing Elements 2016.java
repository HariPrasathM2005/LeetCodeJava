public class MaximumDifferenceIncreasing2016 
{
    public static int maximumDifference(int[] nums) 
    {
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {            
                if(nums[i]<nums[j] && i<j)
                {
                    int diff=nums[j]-nums[i];
                    if(diff>max)
                    {
                        max=diff;
                    }
                }
            }
        }
        return max;    
    }
    public static void main(String[] args) {
        int[] nums1={7,1,5,4};
        int[] nums2={1,5,2,10};
        int res=maximumDifference(nums2);
        System.out.println(res);
    }
}
