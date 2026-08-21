import java.util.*;
import java.io.*;
public class Evennumberofdigits1295
{
    public static int digitcount(int n)
    {
        int l=0;
        while(n>0)
        {
            l=l+1;
            n=n/10;
        }
        return l;
    }
    public static int findNumbers(int[] nums) 
    {
        int Res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(digitcount(nums[i])%2==0)
            {
                Res=Res+1;
            }
        }
        return Res;
    }
    public static void main(String[] args)
    {
        int[] nums={12,345,2,6,7896};
        int res=findNumbers(nums);
        System.out.println(res);
    }
}
