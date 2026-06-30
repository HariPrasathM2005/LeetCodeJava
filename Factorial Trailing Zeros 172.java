
import java.math.BigInteger;

public class FactorialTrailingZeros172
{
    public static int trailingZeroes(int n)
    {
        int Res=0;
        BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++)
            fact=fact.multiply(BigInteger.valueOf(i));
        System.out.println(n+" "+fact);
        for(int i=String.valueOf(fact).length()-1;i>=0;i--)
        {
            if(String.valueOf(fact).charAt(i)=='0')
                Res=Res+1;
            else
                break;
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        int n=30;   
        int res=trailingZeroes(n);
        System.out.println(res); 
    }
}
