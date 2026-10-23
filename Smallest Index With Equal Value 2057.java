public class SmallestIndex2057 
{
    public static int smallestEqual(int[] nums) 
    {
        int res=100;
        for(int i=0;i<nums.length;i++)
        {
            if(i%10==(nums[i]))
            {
                if(res>i)
                    res=i;
            }
        }
        if(res==100)
            res=-1;
        return res;
    }
    public static void main(String[] args) 
    {
        int[] nums1={0,1,2};
        int[] nums2={4,3,2,1};
        int[] nums3={7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
        int res=smallestEqual(nums3);
        System.out.println(res);    
    }    
}
