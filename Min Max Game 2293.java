public class MinMaxGame2293 
{
    public static int Min(int n1, int n2)
    {
        if(n1>n2)
            return n2;
        else
            return n1;
    }
    public static int Max(int n1, int n2)
    {
        if(n1>n2)
            return n1;
        else
            return n2;
    }
    public static int[] makeArray(int[] nums)
    {
        int[] newArray=new int[nums.length/2];
        int ind=0;
        
        for(int i=0;i<nums.length;i=i+4)
        {
            newArray[ind]=Min(nums[i],nums[i+1]);
            ind=ind+1;
            newArray[ind]=Max(nums[i+2],nums[i+3]);
            ind=ind+1;
        }
        return newArray;
    }
    public static int minMaxGame(int[] nums) 
    {
        if(nums.length==1)
            return nums[0];
        int res=0;
        int len=nums.length;
        Display(nums);
        while(len>2)
        {
            int[] newArray=new int[nums.length/2];
            newArray=makeArray(nums);
            len=newArray.length;
            nums=newArray;
            Display(newArray);
        }
        res=Min(nums[0],nums[1]);
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
        int[] nums1={1,3,5,2,4,8,2,2};
        int[] nums2={3};
        int res=minMaxGame(nums2);
        System.out.println(res);
    }
}
