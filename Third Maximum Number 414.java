class Solution {
    public static int[] SortRev(int[] A)
    {
        int i=0,temp;
        while(i<A.length-1)
        {
            if(A[i]<A[i+1])
            {
                temp=A[i];
                A[i]=A[i+1];
                A[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }
        return A;
    }
    public static int findmax(int[] nums)
    {
        int Max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(Max<=nums[i])
                Max=nums[i];
        }
        return Max;
    }
    public int thirdMax(int[] nums) {
        int res=0;
        nums=SortRev(nums);
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
                c=c+1;
            else if(i>0)
            {
                if(nums[i]!=nums[i-1])
                    c=c+1;
            }
            
            if(c==3)
                return nums[i];
        }
        res=findmax(nums);
        return res;
    }
}
