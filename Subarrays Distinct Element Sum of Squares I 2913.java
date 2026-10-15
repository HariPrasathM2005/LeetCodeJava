import java.util.*;
import java.io.*;
public class SubarrayDistinctSum2913 
{
    static List<Integer> Res=new ArrayList<>();
    static List<List<Integer>> result=new ArrayList<>();

    static List<List<Integer>> num=new ArrayList<>();
    static List<Integer> sub=new ArrayList<>();
    public static void findSubsets(int[] arr, int index, List<Integer> subset) 
    {
        result.add(new ArrayList<>(subset));
        for(int i=index;i<arr.length;i++) 
        {    
            subset.add(arr[i]);                 
            findSubsets(arr, i + 1, subset);   
            subset.remove(subset.size() - 1);  
        }
    }
    public static void findSubsets2(List<Integer> arr, int index, List<Integer> subset) 
    {
        
        Res.add(Distinct(subset));
        result.add(new ArrayList<>(subset));
        
        
        for(int i=index;i<arr.size();i++) 
        {    
            subset.add(arr.get(i));                 
            findSubsets2(arr, i + 1, subset);   
            subset.remove(subset.size() - 1);
              
        }

    }
    public static void FindSubsets(List<Integer> arr)
    {
        num.clear();
        sub.clear();
        Res.clear();
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i;j<arr.size();j++)
            {
                for(int k=i;k<j+1;k++)
                {
                    sub.add(arr.get(k));
                }
                Res.add(Distinct(sub));
                num.add(new ArrayList<>(sub));
                sub.clear();
            }
        }
        System.out.println("New:"+num);
    }
    public static int Distinct(List<Integer> A)
    {
        int res=0;
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            if(!nums.contains(A.get(i)))
            {
                //System.out.println(A.get(i));
                res=res+1;
                nums.add(A.get(i));
            }
        }
        return res;
    }
    public static int sumCounts(List<Integer> nums) 
    {
        int res=0;
        result.clear();
        Res.clear();
        FindSubsets(nums);  
        System.out.println(Res);
        for(int i=0;i<Res.size();i++)
        {
            res=res+(Res.get(i)*Res.get(i));
        } 
        return res;
    }
    public static int[] convert(List<Integer> A)
    {
        int[] res=new int[A.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=A.get(i);
        }
        return res;
    }
    public static void main(String[] args) 
    {
        List<Integer> nums1=List.of(1,2,3);
        List<Integer> nums2=List.of(1,2,1);
        List<Integer> nums3=List.of(1,1);
        int res=sumCounts(nums2);
        System.out.println(res);

    }    
}
