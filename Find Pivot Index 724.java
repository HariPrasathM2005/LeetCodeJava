import java.util.*;
public class FindPivotIndex724 
{
    static int sum;
    public static void Calculate(List<Integer> A)
    {
        sum=0;
        for(int i=0;i<A.size();i++)
        {
            sum=sum+A.get(i);
        }
    }
    public static int pivotIndex(int[] nums) 
    {
        int Res=nums[0];
        int left,right;

        for(int i=0;i<nums.length;i++)
        {
            left=i-1;
            right=i+1;
            int leftSum=0,rightSum=0;
            while(left>=0)
            {
                leftSum=leftSum+nums[left];
                left=left-1;
            }    
            while(right<nums.length)
            {
                rightSum=rightSum+nums[right];
                right=right+1;
            }
            //System.out.println("left: "+left+" right: "+right+" Left sum: "+leftSum+" Right Sum: "+rightSum);
            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int nums[]={1,7,3,6,5,6};
        int Res=pivotIndex(nums);
        System.out.println(Res);
    }    
}
