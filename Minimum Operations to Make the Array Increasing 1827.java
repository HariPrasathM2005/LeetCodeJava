public class MakeArrayAscending1827 
{
    public static int minOperations(int[] nums) 
    {
        int res=0,prev=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=prev)
            {
                System.out.println(prev+" "+nums[i]);
                res=res+(prev-nums[i]+1);
                nums[i]=nums[i]+(prev-nums[i])+1;
                System.out.println(nums[i]);
                prev=nums[i];
            }
            prev=nums[i];
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int[] nums1={1,5,2,4,1};
        int[] nums2={1,1,1};
        int res=minOperations(nums1);
        System.out.println(res);
    }    
}
