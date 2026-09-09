import java.util.*;
public class SortArraybyParityII922
{
    static List<Integer> odds=new ArrayList<>();
    static List<Integer> evens=new ArrayList<>();
    public static int[] sortArrayByParityII(int[] nums) 
    {
        int[] Res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                evens.add(nums[i]);
            }
            else
            {
                odds.add(nums[i]);
            }
        }
        int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                Res[i]=evens.get(ind);
            }
            else
            {
                Res[i]=odds.get(ind);
                ind=ind+1;
            }
        }
        return Res;
    }
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[] nums={4,2,5,7};
        int[] res=sortArrayByParityII(nums);
        Display(res);
    }
}
