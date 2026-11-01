
public class NumberAfterDoubleReversal2119 
{
    public static int reverse(int num)
    {
        int res=0;
        while(num>0)
        {
            res=(res*10)+(num%10);
            num=num/10;
        }
        return res;
    }
    public static boolean isSameAfterReversals(int num) 
    {
        int rev=reverse(reverse(num));
        if(num==rev)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        int num1=526;
        int num2=1800;
        boolean res=isSameAfterReversals(num2);
        System.out.println(res);
    }
}
