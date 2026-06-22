public class SignofProductArray1822 
{
    public static int arraySign(int[] nums)
    {
        double prd=1;
        for(int i=0;i<nums.length;i++)
        {
            prd=prd*nums[i];
            if(nums[i]==0)
                return 0;
        }
        if(prd<0)
            return -1;
        else if(prd>0)
            return 1;
        else if(prd==0)
            return 0;
        return -1;
    }
    public static void main(String[] args) 
    {
        int[] nums={-1,-2,-3,-4,3,2,1};
        int val=arraySign(nums);
        System.out.println(val);
    }
}
