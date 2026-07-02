public class RemoveZeros3726 
{
    public static long removeZeros(long n) 
    {
        String num=String.valueOf(n);
        long Res=0;
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)!='0')
                Res=(Res*10)+Long.parseLong(String.valueOf(num.charAt(i)));
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        long n=1020030;   
        long val=removeZeros(n);
        System.out.println(val);
    }
}
