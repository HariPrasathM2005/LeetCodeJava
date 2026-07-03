import java.util.*;
public class LexiographicalNumbers336 
{
    public static void Display(String[] A)
    {
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+" ");
        System.out.println();
    }
    public static List<Integer> lexicalOrder(int n) 
    {
        String[] Nums=new String[n];
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<n;i++)
            Nums[i]=String.valueOf(i+1);
        Arrays.sort(Nums);
        for(int i=0;i<n;i++)
        {
            nums.add(Integer.parseInt(Nums[i]));
        }
        return nums;
    }
    public static void main(String[] args) 
    {
        int n=2;
        List<Integer> Nums=lexicalOrder(n);
        System.out.println(Nums);

    }
    
}
