public class MaximumConsecutiveOnes461 
{
    public static int findMaxConsecutiveOnes(int[] nums)
    {
        int Res=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                c=c+1;
            else
                c=0;
            if(Res<=c)
                Res=c;
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        int[] arr={1,0,1,1,0,1};
        int val=findMaxConsecutiveOnes(arr);
        System.out.println(val);
    }    
}
