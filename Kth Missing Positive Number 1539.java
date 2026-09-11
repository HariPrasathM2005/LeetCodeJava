import java.util.*;

public class KthMissingPositiveNumber1539
{
    public static int findKthPositive(int[] arr, int k) 
    {
        int res=0;
        int n=1;
        int i=0;
        List<Integer> missing=new ArrayList<>();
        while(i<arr.length)
        {
            if(n<arr[i])
            {
                missing.add(n);
                n=n+1;
            }
            else if(n==arr[i])
            {
                i=i+1;
                n=n+1;
            }
        }
        if(k>missing.size())
        {
            for(i=0;i<k;i++)
            {
                missing.add(arr[arr.length-1]+1+i);
            }
        }
        System.out.println(missing);
        res=missing.get(k-1);
        return res;    
    }
    public static void main(String[] args) 
    {
        int[] nums={2,3,4,7,11};
        int[] nums2={1,2,3,4};
        int res=findKthPositive(nums, 5);
        System.out.println(res);
    }
}
