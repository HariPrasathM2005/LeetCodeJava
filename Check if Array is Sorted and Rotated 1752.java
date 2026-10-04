import java.util.*;
import java.io.*;
public class ArraySortedRotated1752 
{
    public static boolean check(int[] nums) 
    {
        boolean Res=true;
        boolean Dec=true,Same=false;
        int change=0;
        if(nums[0]>nums[1])
        {
            Dec=true;
        }
        else if(nums[0]<nums[1])
        {
            Dec=false;
        }
        else if(nums[0]==nums[1])
        {
            Same=true;
            Dec=false;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1] && Dec==true)
            {
                System.out.println("Change occured: "+nums[i]+" "+nums[i+1]);
                change=change+1;
                Dec=false;
            }
            else if(nums[i]>nums[i+1] && Dec==false)
            {
                System.out.println("Change occured: "+nums[i]+" "+nums[i+1]);
                change=change+1;
                Dec=false;
            }

            if(change>1)
                return false;
        }
        return Res;    
    }
    static List<Integer> indices=new ArrayList<>();
    public static boolean check2(int[] nums)
    {
        indices.clear();
        int ind;
        ind=FindSmallest(nums);
        Occurences(nums, ind);
        System.out.println("Indices: "+indices);
        
        int c=0,i=0;
        boolean fail=false;
        for(int j=0;j<indices.size();j++)
        {
            ind=indices.get(j);
            System.out.println(ind);
            fail=false;
            while(c<nums.length-1)
            {
                System.out.println(nums[(ind+i)%nums.length]+" "+nums[(ind+i+1)%nums.length]);
                if(nums[(ind+i)%nums.length]>nums[(ind+i+1)%nums.length])
                {
                    fail=true;
                    break;
                }
                i=i+1;
                c=c+1;
            }
        }
        if(fail)
            return false;
        return true;
    }
    public static int FindSmallest(int[] nums)
    {
        int ind=0;
        int small=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(small>nums[i])
            {
                small=nums[i];
                ind=i;
            }
        }
        return ind;
    }
    public static void Occurences(int[] nums,int n)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[n])
            {
                indices.add(i);
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] nums1={3,4,5,1,2};
        int[] nums2={1,1,1,1};
        int[] nums3={3,2,10};
        int[] nums4={2,1,3,4};
        int[] nums5={6,16,6};
        int[] nums6={10,6,6,10};
        boolean Res=check2(nums6);
        System.out.println(Res);
    }    
}
