import java.util.*;
public class GreatestCommonDivisor1979
{
    public static int findGCD(int[] nums) 
    {
        int Res=1;
        Arrays.sort(nums);
        int n1=nums[0],n2=nums[nums.length-1];
        int i=1;
        while(i<=n1)
        {
            if(n1%i==0 && n2%i==0)
                Res=i;
            i++;
        }
        return Res;
    }
    public static void main(String[] args)
    {
        int[] arr={2,5,6,9,10};
        int Res=findGCD(arr);
        System.out.println(Res);
    }
}
