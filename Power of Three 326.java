import java.util.ArrayList;
import java.util.List;

public class PowerofThree326 
{
    public static boolean isPowerOfThree(int n)
    {
        int num=1;
        if(n<0)
            return false;
        if((n%3==1 || n%3==2) && n!=1 && n<0)
            return false;
        List<Integer> power=new ArrayList<>();
        while(true)
        {
            power.add(num);
            if(String.valueOf(num).length()>String.valueOf(n).length())
            {
                break;
            }
            num=num*3;
        }
        System.out.println(power);
        if(power.contains(n))
            return true;
        return false;
    }
    public static void main(String[] args) 
    {
        int n=27;
        boolean val=isPowerOfThree(n);
        System.out.println(val);
    }
    
}
