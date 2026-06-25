import java.util.*;
public class HappyNumber202
{
    public static boolean isHappy(int n)
    {
        boolean Res=false;
        int prd=n;
        ArrayList<Integer> nums=new ArrayList<>();
        while(prd!=1)
        {
            int temp=prd;
            int res=0;
            while(temp>0)
            {
                res=res+((temp%10)*(temp%10));
                temp=temp/10;
            }
            prd=res;
            
            //System.out.println("Product: "+prd);
            //System.out.println(nums);
            if(nums.contains(prd))
            {
                break;
            }
            nums.add(res);
        }
        if(prd==1)
            return true;
        return Res;
    }
    public static void main(String[] args) 
    {
        int n=19;    
        boolean val=isHappy(n);
        System.out.println(val);
    }
}
