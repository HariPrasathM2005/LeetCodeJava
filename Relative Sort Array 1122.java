import java.util.*;
import java.io.*;
public class RelativeSortArray1122
{
    public static int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        int[] Res=new int[arr1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
            {
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else
            {
                map.put(arr1[i],1);
            }
        }
        //System.out.println(map);
        int ind=0;
        for(int i=0;i<arr2.length;i++)
        {
        
            int c=map.get(arr2[i]);
            map.remove(arr2[i]);
            for(int j=0;j<c;j++)
            {
                Res[ind]=arr2[i];
                ind=ind+1;
            }
        }
        if(!map.isEmpty())
        {
            //System.out.println(map);
            List<Integer> nums=new ArrayList<>(map.keySet());
            
            nums.sort(null);
            //System.out.println(nums);
            for(int i=0;i<nums.size();i++)
            {
                int c=map.get(nums.get(i));
                for(int j=0;j<c;j++)
                {
                    Res[ind]=nums.get(i);
                    ind=ind+1;
                }
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
        int[] arr1={2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] arr2={2,42,38,0,43,21};
        int[] Res=relativeSortArray(arr1,arr2);
        Display(Res);
    }
}
