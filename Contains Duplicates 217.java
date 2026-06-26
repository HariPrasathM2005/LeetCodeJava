import java.util.*;
public class ContainsDuplicate217
{
    public static boolean containsDuplicate(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j && nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate2(int[] nums)
    {
        HashMap<Integer,Integer> Nums=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Nums.put(nums[i],Nums.getOrDefault(nums[i], 0)+1);
            if(Nums.get(nums[i])>1)
                return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,2};
        boolean val=containsDuplicate2(arr);
        System.out.println(val);
        
    }
}
