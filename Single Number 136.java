import java.util.*;
public class SingleNumber136 
{
    public static int singleNumber(int[] nums)
    {
        HashMap<Integer,Integer> Nums=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Nums.put(nums[i], Nums.getOrDefault(nums[i],0)+1);
            
        }
        for(int i=0;i<nums.length;i++)
        {
            if(Nums.get(nums[i])==1)
                return nums[i];
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        int[] arr={4,2,1,2,4,1,5};
        int val=singleNumber(arr);
        System.out.println(val);
    }    
}
