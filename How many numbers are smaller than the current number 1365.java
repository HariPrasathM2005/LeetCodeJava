public class SmallerthanCurrent1365 
{
    public static int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] Res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            Res[i]=FindLess(nums, nums[i]);
        }
        return Res;
    }
    public static int FindLess(int[] nums, int n)
    {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<n)
                res=res+1;
        }
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
        int[] Nums1={8,1,2,2,3};
        int[] Nums2={6,5,4,8};
        int[] Nums3={7,7,7,7};
        int[] Res=smallerNumbersThanCurrent(Nums3);
        Display(Res);
    }    
}
