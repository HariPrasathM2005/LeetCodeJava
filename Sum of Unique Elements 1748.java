import java.util.*;
import java.io.*;
public class SumofUniqueElements1748 
{
    static List<Integer> Nums=new ArrayList<>();
    public static int sumOfUnique(int[] nums) 
    {
        int Res=0;
        Nums.clear();
        List<Integer> Rem=new ArrayList<>();
        Rem.clear();
        for(int i=0;i<nums.length;i++)
        {
            if(!Nums.contains(nums[i]) && !Rem.contains(nums[i]))
            {
                Nums.add(nums[i]);
            }
            else
            {
                Rem.add(nums[i]);
                Remove(nums[i]);
            }
        }
        System.out.println(Nums);
        Res=Sum();
        return Res;
    }
    public static void Remove(int n)
    {

        for(int i=0;i<Nums.size();i++)
        {
            if(Nums.get(i)==n)
            {
                System.out.println("List: "+Nums+"  Index: "+i);
                Nums.remove(i);
                return;
            }
        }
    }
    public static int Sum()
    {
        int Sum=0;
        for(int i=0;i<Nums.size();i++)
        {
            Sum=Sum+Nums.get(i);
        }
        return Sum;
    }
    public static void main(String[] args) 
    {
        int[] nums1={1,2,3,2};
        int[] nums2={1,1,1,1,1};
        int[] nums3={10,6,9,6,9,6,8,7};
        int res=sumOfUnique(nums3);
        System.out.println(res);
    }    
}
