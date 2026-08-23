import java.util.*;
public class CreateTargetArray1389 
{
    public static int[] toArray(List<Integer> A)
    {
        int[] res=new int[A.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=A.get(i);
        }
        return res;
    }
    public static int[] createTargetArray(int[] nums, int[] index) 
    {
        int[] res=new int[nums.length];
        List<Integer> Res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            Res.add(index[i],nums[i]);
        }
        //System.out.println(Res);
        res=toArray(Res);
        return res;
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
        int[] nums={0,1,2,3,4};
        int[] ind={0,1,2,2,1};
        int[] res=createTargetArray(nums, ind);
        Display(res);
    }    
}
