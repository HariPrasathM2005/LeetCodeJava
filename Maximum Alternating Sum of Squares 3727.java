import java.util.*;
import java.io.*;
public class MaximumAlterating3727 
{
    public static long maxAlternatingSum(int[] nums) 
    {
        long res=0;
        nums=ChangeSign(nums);
        Arrays.sort(nums);
        int len=nums.length;
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        if(len%2==1)
        {
            for(int i=0;i<(len/2);i++)
            {
                odd.add(nums[i]);
                res=res-(nums[i]*nums[i]);
            }
            for(int i=(len/2);i<len;i++)
            {
                even.add(nums[i]);
                res=res+(nums[i]*nums[i]);
            }
            System.out.println("Odd:"+odd);
            System.out.println("Even:"+even);
        }
        else
        {
            for(int i=0;i<len/2;i++)
            {
                odd.add(nums[i]);
                res=res-(nums[i]*nums[i]);
            }
            for(int i=len/2;i<len;i++)
            {
                even.add(nums[i]);
                res=res+(nums[i]*nums[i]);
            }
            System.out.println("Odd:"+odd);
            System.out.println("Even:"+even);
        }
        return res;
    }
    public static int[] ChangeSign(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<0)
                A[i]=-A[i];
        }
        return A;
    }
    public static void main(String[] args) 
    {
        int[] nums1={1,2,3};
        int[] nums2={1,2,3,0};
        int[] nums3={1,-1,2,-2,3,-3};
        long res=maxAlternatingSum(nums3);
        System.out.println(res);    
    }
    
}
