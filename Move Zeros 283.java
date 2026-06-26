public class MoveZeros283
{
    public static void Display(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void moveZeroes(int[] nums) 
    {
        int i=0,temp;
        while(i<nums.length-1)
        {
            if(nums[i]==0 && nums[i+1]!=0)
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
        Display(nums);
    }
    public static void main(String[] args) 
    {
        int[] arr={0,1,0,3,12};
        moveZeroes(arr);
    }
}
