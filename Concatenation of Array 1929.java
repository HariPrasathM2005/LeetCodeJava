public class ConcatenationofArray1929 
{
    public static int[] getConcatenation(int[] nums) 
    {
        int[] Res=new int[2*nums.length];
        for(int i=0;i<Res.length;i++)
        {
            Res[i]=nums[i%nums.length];
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
        int[] nums1={1,2,1};
        int[] nums2={1,3,2,1};
        int[] res=getConcatenation(nums2);
        Display(res);
    }    
}
