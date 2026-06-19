import java.util.*;
public class SortColors
{
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public void sortColors(int[] nums) 
    {
        int ind=0,temp;
        while(ind<nums.length-1)
        {
            if(nums[ind]>nums[ind+1])
            {
                temp=nums[ind];
                nums[ind]=nums[ind+1];
                nums[ind+1]=temp;
                if(ind>0)
                    ind=ind-1;
            }
            else
                ind=ind+1;
        }
        Display(nums);
    }
    public static void main(String[] args) 
    {
        SortColors obj=new SortColors();
        Scanner sc=new Scanner(System.in);
        int[] nums={2,0,2,1,1,0};        
        obj.sortColors(nums);
    }
}
