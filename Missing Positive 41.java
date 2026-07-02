import java.util.*;
public class MissingPositive41
{
    public static int[] Sort(int[] arr)
    {
        int i=0,temp;
        while(i<arr.length-1)
        {
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }
        return arr;
    }
    public static int firstMissingPositive(int[] nums)
    {
        int n=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                if(nums[i]==n)
                {
                    //System.out.println(nums[i]+" "+n);
                    n=n+1;
                }
                else
                {
                    if(i>0)
                    {
                        if(nums[i]!=nums[i-1])
                            return n;
                    }
                }
            }
        }
        return n;
    }
    public static void main(String[] args)
    {
        int[] arr={0,2,2,1,1};
        int[] arr1={0,1,2};
        int res=firstMissingPositive(arr1);
        System.out.println(res);
    }
}
