import java.util.*;
import java.io.*;
public class RemoveDuplicates 
{
    public static int present(int[] num,int val)
    {
        int Present=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==val)
                Present=1;
        }
        return Present;
    }
    public static void Display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int removeDuplicates(int[] nums)
    {
        int length=0,ind=0,p=0;
        int[] arr=new int[nums.length];
        int[] l=new int[5];
        boolean first=true;
        for(int i=0;i<nums.length;i++)
        {
            p=present(arr,nums[i]);
            if(p==0)
            {
                arr[ind]=nums[i];
                nums[ind]=nums[i];
                ind=ind+1;
            }
            else if(nums[i]==0 && first)
            {
                arr[ind]=nums[i];
                nums[ind]=nums[i];
                ind=ind+1;
                first=false;
            }
        }

        length=ind;
        Display(arr);
        Display(nums);
        return length;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //[0,0,1,1,1,2,2,3,3,4]
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int l;
        l=removeDuplicates(arr);
        System.out.println(l);
    }
}
