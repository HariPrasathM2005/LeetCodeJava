public class ElementSum2535 
{
    public static int DigitSum(int num)
    {
        int Sum=0;
        while(num>0)
        {
            Sum=Sum+(num%10);
            num=num/10;
        }
        return Sum;
    }
    public static int differenceOfSum(int[] nums) 
    {
        int res=0,elementsum=0,digitsum=0,c;
        for(int i=0;i<nums.length;i++)
        {
            elementsum=elementsum+nums[i];
            c=DigitSum(nums[i]);
            digitsum=digitsum+c;
        }
        res=elementsum-digitsum;
        if(res<0)
        {
            res=-res;
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int[] nums={1,2,3,4};
        int res=differenceOfSum(nums);
        System.out.println(res);
    }
}
