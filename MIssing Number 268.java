public class MissingNumber268 
{
    public static int[] Sort(int[] nums)
    {
        int i=0,temp;
        while(i<nums.length-1)
        {
            if(nums[i]>nums[i+1])
            {
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }
        return nums;
    }
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static int missingNumber(int[] nums)
    {
        int res=0;
        nums=Sort(nums);
        if(nums[nums.length-1]!=nums.length)
            return nums.length;
        Display(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
                return i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        int res=missingNumber(arr);
        System.out.println(res);
    }    
}
