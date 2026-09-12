import java.util.*;
public class LargestNumber179 
{
    public static boolean Comp(String n1,String n2)
    {

        int N1=Integer.valueOf(n1+n2);
        int N2=Integer.valueOf(n2+n1);
        if(N1>N2)
        {
            return false;//No swap needed
        }
        else
        {
            return true;//Swap needed
        }
    }
    public static List<String> reorder(List<String> nums,int c)
    {
        List<String> res=new ArrayList<>(nums);
        int ind=0;
        System.out.println(nums.size());
        if(c==0)
        {
            for(int i=nums.size()-1;i>0;i--)
            {
                if(Comp(nums.get(i),nums.get(i-1)))
                {
                    //System.out.println("Swap: "+nums.get(i)+" "+nums.get(i-1));
                    res.set(ind,nums.get(i-1));
                    nums.set(i-1,nums.get(i));
                    /*if(i<nums.size()-1 && ind>0)
                    {
                        i=i+1;
                        ind=ind-1;
                    }*/
                    ind=ind+1;
                }
                else
                {
                    //System.out.println("No swap: "+nums.get(i)+" "+nums.get(i-1));
                    res.set(ind,nums.get(i));
                    ind=ind+1;
                }
                System.out.println(res);
                
            }
            if(Comp(nums.get(1),nums.get(0)))
            {
                //System.out.println("Swap: "+nums.get(1)+" "+nums.get(0));
                res.set(ind,nums.get(1));
            }
            else
            {
                //System.out.println("No swap: "+nums.get(1)+" "+nums.get(0));
                res.set(ind,nums.get(0));
            }
        }
        else if(c==1)
        {
            for(int i=0;i<nums.size()-1;i++)
            {
                if(Comp(nums.get(i),nums.get(i+1)))
                {
                    //System.out.println("Swap: "+nums.get(i)+" "+nums.get(i+1));
                    res.set(ind,nums.get(i+1));
                    nums.set(i+1,nums.get(i));
                    /*if(i<nums.size()-1 && ind>0)
                    {
                        i=i+1;
                        ind=ind-1;
                    }*/
                    ind=ind+1;
                }
                else
                {
                    //System.out.println("No swap: "+nums.get(i)+" "+nums.get(i+1));
                    res.set(ind,nums.get(i));
                    ind=ind+1;
                }
                System.out.println(res);
                
            }
            if(Comp(nums.get(nums.size()-2),nums.get(nums.size()-1)))
            {
                //System.out.println("Swap: "+nums.get(nums.size()-2)+" "+nums.get(nums.size()-1));
                res.set(ind,nums.get(nums.size()-2));
            }
            else
            {
                //System.out.println("No swap: "+nums.get(nums.size()-2)+" "+nums.get(nums.size()-1));
                res.set(ind,nums.get(nums.size()-1));
            }
        }
        return res;
    }
    public static String largestNumber(int[] nums)
    {
        String Res="";
        if(nums.length<2)
        {
            Res=String.valueOf(nums[0]);
            return Res;
        }
        else if(nums.length==2)
        {
            if(nums[0]==0 && nums[1]==0)
            {
                return "0";
            }
            if(nums[0]==nums[1])
            {
                return nums[0]+""+nums[1];
            }
            long N1=Long.valueOf(nums[0]+""+nums[1]);
            long N2=Long.valueOf(nums[1]+""+nums[0]);
            if(N1>=N2)
            {
                return String.valueOf(N1);
            }
            else
            {
                return String.valueOf(N2);
            }
        
        }
        Arrays.sort(nums);
        List<String> Nums=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            Nums.add(String.valueOf(nums[i]));
        }
        Nums.sort(null);
        Nums=reorder(Nums,0);
        for(int i=0;i<13;i++)
        {
            Nums=reorder(Nums,1);
        }
        System.out.println(Nums);
        for(int i=0;i<Nums.size();i++)
        {
            Res=Res+Nums.get(i);
        }
        try
        {
            return String.valueOf(Integer.valueOf(Res));
        }
        catch(Exception e)
        {
            return Res;
        }
    }
    public static void main(String[] args) 
    {
        int[] nums={42,3,30,34,5,9};
        int[] nums2={412,9,413,500};
        int[] nums3={128,12,320,32};
        int[] nums4={0,0};
        int[] nums5={74,21,33,51,77,51,90,60,5,56};
        String Res=largestNumber(nums5);
        System.out.println(Res);
    }    
}
