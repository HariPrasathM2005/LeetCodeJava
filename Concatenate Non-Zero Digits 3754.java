public class Concatenate3754
{
    public static long sumAndMultiply(int n)
    {
        long Res=0;
        int Sum=0;
        String val=String.valueOf(n);
        for(int i=0;i<val.length();i++)
        {
            if(val.charAt(i)!='0')
            {
                Res=(Res*10)+Character.getNumericValue(val.charAt(i));
                Sum=Sum+(Character.getNumericValue(val.charAt(i)));
            }
        }
        return Res*Sum;
    }
    public static void main(String[] args) 
    {
        int n=10203004;
        long Res=sumAndMultiply(n);
        System.out.println(Res);
    }   
}
