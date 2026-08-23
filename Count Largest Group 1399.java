import java.util.*;
public class CountLargestGroup1399 
{
    public static int sumofdigits(int n)
    {
        int res=0;
        while(n>0)
        {
            res=res+(n%10);
            n=n/10;
        }
        /*if(res>9)
            res=sumofdigits(res);*/
        return res;
    }
    public static int countLargestGroup(int n) 
    {
        int res=0;
        List<List<Integer>> nums=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            int v=sumofdigits(i);
            
            sub.add(i);
            if(v<=nums.size())
            {
                nums.get(v-1).add(i);
            }
            else
                nums.add(v-1,new ArrayList<>(sub));
            sub.clear();
        }
        int Max=nums.get(0).size();
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i).size()>Max)
            {
                Max=nums.get(i).size();
                res=1;
            }
            else if(nums.get(i).size()==Max)
            {
                res=res+1;
            }
        }
        System.out.println(nums);
        return res;
    }
    public static void main(String[] args) 
    {
        int n=24;
        int res=countLargestGroup(n);
        System.out.println(res);
    }    
}
