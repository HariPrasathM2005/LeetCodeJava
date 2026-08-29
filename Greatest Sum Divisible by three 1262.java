import java.util.*;
public class GreatestNumberDivisiblebythree1262 
{
    static List<Integer> Nums=new ArrayList<>();
    public static int FindSum()
    {
        int sum=0;
        for(int i=0;i<Nums.size();i++)
        {
            sum=sum+Nums.get(i);
        }
        return sum;
    }
    public static int maxSumDivThree(int[] nums) 
    {
        int Sum=0;
        Nums.clear();
        for(int i=0;i<nums.length;i++)
        {
            Nums.add(nums[i]);
        }
        Sum=FindSum();
        System.out.println(Nums);
        while(Sum%3!=0)
        {
            int i=0,c=0,sum=0,min=1000,Ind=0;
            if(Sum%3==1)
            {
                if(Nums.size()==1)
                    return 0;
                System.out.println("Rem: 1");
                Nums.sort(null);
                System.out.println(Nums);

                while(i<Nums.size())
                {
                    if(Nums.get(i)%3==1)
                    {
                        min=Nums.get(i);
                        Ind=i;
                        break;
                    }
                    i=i+1;
                }
                
                i=0;
                c=0;
                sum=0;
                int[] ind=new int[2];
                while(i<Nums.size() && c<2)
                {
                    if(Nums.get(i)%3==2)
                    {
                        ind[c]=i;
                        sum=sum+Nums.get(i);
                        c=c+1;
                        
                    }
                    i=i+1;
                }
                System.out.println(min+" "+sum);
                if((min<sum || sum==0))
                {
                    Nums.remove(Ind);
                    System.out.println(Nums);
                    return FindSum();
                }
                else if(c==2)
                {
                    Nums.remove(ind[1]);
                    Nums.remove(ind[0]);
                    return FindSum();
                }
                
            }
            else if(Sum%3==2)
            {
                System.out.println("Rem: 2");
                Nums.sort(null);
                System.out.println(Nums);
                
                min=1000;
                Ind=0;
                for(i=0;i<Nums.size();i++)
                {
                    if(Nums.get(i)%3==2)
                    {
                        min=Nums.get(i);
                        Ind=i;
                        System.out.println(Nums);
                        break;
                    }
                }
                
                i=0;
                c=0;
                sum=0;
                int[] ind=new int[2];
                while(i<Nums.size() && c<2)
                {
                    if(Nums.get(i)%3==1)
                    {
                        ind[c]=i;
                        c=c+1;
                        sum=sum+Nums.get(i);
                    }
                    i=i+1;
                }
                if(c==2 && sum<min)
                {
                    System.out.println(min+" "+sum);
                    
                    Nums.remove(ind[1]);
                    Nums.remove(ind[0]);
                    return FindSum();
                }
                else
                {
                    System.out.println(Ind);
                    Nums.remove(Integer.valueOf(min));
                    return FindSum();
                }
            }
            Sum=FindSum();
        }
        return Sum;    
    }
    public static void main(String[] args) 
    {
        int[] nums={2,14,15,17,6,18,12,18,15,4};
        int res=maxSumDivThree(nums);
        System.out.println(res);
    }    
}
