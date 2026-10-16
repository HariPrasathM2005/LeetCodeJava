public class AbsoluteDifference006 
{
    public static int countKDifference(int[] nums, int k) 
    {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j && ((nums[i]-nums[j]==k)||(nums[j]-nums[i]==k)))
                    res=res+1;
            }
        }
        return res/2;    
    }
    public static void main(String[] args) 
    {
        int[] nums1={1,2,2,1};
        int[] nums2={3,2,1,5,4};
        int res=countKDifference(nums2, 2);
        System.out.println(res);
    }    
}
