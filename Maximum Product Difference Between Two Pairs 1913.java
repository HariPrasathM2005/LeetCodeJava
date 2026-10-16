public class MaximumProductDifference1913 
{
    public static int maxProductDifference(int[] nums) 
    {
        int temp,ind=0;
        while(ind<nums.length-1)
        {
            if(nums[ind]>nums[ind+1])
            {
                temp=nums[ind];
                nums[ind]=nums[ind+1];
                nums[ind+1]=temp;
                if(ind>0)
                    ind=ind-1;
            }
            else
                ind=ind+1;
        }   
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
    }
    public static void main(String[] args) 
    {
        int[] nums1={5,6,2,7,4};
        int[] nums2={4,2,5,9,7,4,8};
        int res=maxProductDifference(nums2);
        System.out.println(res);
    }
}
