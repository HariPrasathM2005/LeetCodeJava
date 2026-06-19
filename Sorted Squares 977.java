public class Squaresofsorted977 
{
    public static int[] Sort(int[] A)
    {
        int temp,ind=0;
        while(ind<A.length-1)
        {
            if(A[ind]>A[ind+1])
            {
                temp=A[ind];
                A[ind]=A[ind+1];
                A[ind+1]=temp;
                if(ind>0)
                    ind=ind-1;
            }
            else
                ind=ind+1;
        }
        return A;
    }
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static int[] sortedSquares(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        nums=Sort(nums);
        Display(nums);
        return nums;
    }
    public static void main(String[] args) 
    {
        int[] nums={-4,-1,0,3,10};    
        nums=sortedSquares(nums);
    }
    
}
