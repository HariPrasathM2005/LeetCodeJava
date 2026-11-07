public class FindClosest2239
{
    public static int findClosestNumber(int[] nums) 
    {
        int res=1000000;
        int res1=-1000000,res2=1000000;
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            int temp_res=res;//stores only postitive
            if(temp_res<0)
                temp_res=-temp_res;
        
            if(nums[i]<0)
            {
                if(res1<nums[i])
                    res1=nums[i];
            }
            else
            {
                if(res2>nums[i])
                    res2=nums[i];
            }
        }
        if(-res1<res2)
            res=res1;
        else
            res=res2;
        return res;
    }
    public static void main(String[] args) 
    {
        int[] arr1={-4,-2,1,4,8};
        int[] arr2={-1,4,5};
        int[] arr3={2,-1,1};
        int[] arr4={-1,2,1,-1,1};
        int[] arr5={2,1,1,-1,100000};
        int res=findClosestNumber(arr4);
        System.out.println(res);
    }
}
