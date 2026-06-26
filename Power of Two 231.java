import java.util.*;
public class Power231
{
    public static boolean isPowerOfTwo(int n)
    {
        int num=1;
        List<Integer> power=new ArrayList<>();
        for(int i=0;i<=n/2;i++)
        {
            power.add(num);
            num=num*2;
        }
        if(power.contains(n))
            return true;
        return false;
    }
    public static boolean isPowerOfTwo2(int n)
    {
        int num=1;
        if(n<0)
            return false;
        if(n%2==1 && n!=1 && n<0)
            return false;
        List<Integer> power=new ArrayList<>();
        while(true)
        {
            power.add(num);
            if(String.valueOf(num).length()>String.valueOf(n).length())
            {
                break;
            }
            num=num*2;
        }
        System.out.println(power);
        if(power.contains(n))
            return true;
        return false;
    }
    public static void main(String[] args) 
    {
        int n=2147483645;
        boolean val=isPowerOfTwo2(n);
        System.out.println(val);
    }
}
