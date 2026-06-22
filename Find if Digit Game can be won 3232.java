public class DigitGame3232 
{
    public static boolean canAliceWin(int[] nums)
    {
        int SingleDigit=0,DoubleDigit=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
                SingleDigit=SingleDigit+nums[i];
            else if(nums[i]>=10)
                DoubleDigit=DoubleDigit+nums[i];
        }
        if(SingleDigit!=DoubleDigit)
            return true;
        return false;
    }
    public static void main(String[] args) 
    {
        int[] nums={1,2,3,4,10};
        Boolean Res=canAliceWin(nums);
        System.out.println(Res);
    }
}
