
public class RotateArray189 
{
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void rotate(int[] nums, int k)
    {
        int[] temp=new int[nums.length];
        //Display(nums);
        if(k>nums.length)
        {
            k=k%nums.length;
        }
        for(int j=0;j<nums.length;j++)
        {
            int ind=nums.length-k+j;
            temp[j]=nums[(ind)%(nums.length)];
            
        }
        //Display(temp);
        System.arraycopy(temp, 0, nums, 0, nums.length);
        Display(nums);
    }
    public static void main(String[] args) 
    {
        int[] nums={1,2,3};
        rotate(nums, 4);    
    }
    
}
