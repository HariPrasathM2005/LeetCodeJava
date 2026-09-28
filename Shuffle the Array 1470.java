public class ShuffletheArray1470 
{
    public static int[] shuffle(int[] nums, int n) 
    {
        int[] res=new int[nums.length];
        int ind=0;
        for(int i=0;i<n;i++)
        {
            res[ind]=nums[i];
            ind=ind+1;
            res[ind]=nums[n+i];
            ind=ind+1;
        }
        return res;    
    }
    public static void Display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[] arr1={2,5,1,3,4,7};
        int[] arr2={1,2,3,4,4,3,2,1};
        int[] res=shuffle(arr2, 4);
        Display(res);  
    }    
}
