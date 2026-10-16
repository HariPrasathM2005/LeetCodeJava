import java.util.*;
import java.io.*;
public class TwoOutofThree2032 
{
    static List<Integer> Distinct=new ArrayList<>();
    static List<Integer> Nums1=new ArrayList<>();
    static List<Integer> Nums2=new ArrayList<>();
    static List<Integer> Nums3=new ArrayList<>();
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        Nums1.clear();
        Nums2.clear();
        Nums3.clear();
        Distinct.clear();
        for(int i=0;i<nums1.length;i++)
            Nums1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
            Nums2.add(nums2[i]);
        for(int i=0;i<nums3.length;i++)
            Nums3.add(nums3[i]);
        AddDistinct(nums1);
        AddDistinct(nums2);
        AddDistinct(nums3);
        return Distinct;    
    }
    public static void AddDistinct(int[] A)
    {
        int c=0;
        for(int i=0;i<A.length;i++)
        {
            if(Nums1.contains(A[i]))
                c=c+1;
            if(Nums2.contains(A[i]))
                c=c+1;
            if(Nums3.contains(A[i]))
                c=c+1;
            if(c>=2)
            {
                if(!Distinct.contains(A[i]))
                    Distinct.add(A[i]);
            }
            c=0;
        }
    }
    public static void main(String[] args) 
    {
        List<Integer> Res1=twoOutOfThree(new int[]{1,1,3,2},new int[]{2,3},new int[]{3});
        List<Integer> Res2=twoOutOfThree(new int[]{3,1},new int[]{2,3},new int[]{1,2});
        System.out.println(Res1);
        System.out.println(Res2);
    }    
}
