import java.util.*;
public class MajorityElement169 
{
    public static int majorityElement(int[] nums)
    {
        int res=0;
        HashMap<Integer,Integer> Nums=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Nums.put(nums[i],Nums.getOrDefault(nums[i], 0)+1);
        }
        //System.out.println(Nums);
        //System.out.println(Collections.max(Nums.values()));
        for(int i=0;i<nums.length;i++)
        {
            if(Collections.max(Nums.values())==Nums.get(nums[i]))
            {
                if(Nums.get(nums[i])>nums.length/2)
                    return nums[i];
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int[] arr={2,2,1,1,1,2,2};
        int val=majorityElement(arr);
        System.out.println(val);
    }
}
