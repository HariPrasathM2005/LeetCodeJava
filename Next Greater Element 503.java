public class NextGreaterElementII503 
{
    public static int findnext(int[] nums,int ind)
    {
        int res=0;
        int ele=nums[ind];
        int c=0;
        for(int i=ind;i<nums.length+ind;i++)
        {
            if(c>2*(nums.length))
                return -1;
            
            if(ele<nums[i])
            {
                return nums[i];
            }
            if(i>=nums.length-1)
                i=-1;
            c=c+1;
        }
        return res;
    }
    public static int[] nextGreaterElements(int[] nums) 
    {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=findnext(nums,i);
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
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        int[] res=nextGreaterElements(nums);
        Display(res);
    }    
}
