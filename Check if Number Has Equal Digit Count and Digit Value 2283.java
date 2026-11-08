public class EqualDigitCount2283 
{
    public static boolean isoccur(String num, int n, int count)
    {
        int c=0;
        for(int i=0;i<num.length();i++)
        {
            if(n==((int)num.charAt(i)-48))
                c=c+1;
        }
        if(c==count)
            return true;
        else
            return false;
    }
    public static boolean digitCount(String num) 
    {
        for(int i=0;i<num.length();i++)
        {
            if(!isoccur(num,i,(int)num.charAt(i)-48))
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        String num1="1210";
        String num2="030";
        boolean res=digitCount(num2);
        System.out.println(res);
    }
}
