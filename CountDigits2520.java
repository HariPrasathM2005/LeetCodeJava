public class CountDigits2520 
{
    public static int countDigits(int num)
    {
        int res=0;
        String Num=String.valueOf(num);
        for(int i=0;i<Num.length();i++)
        {
            if(num%(Character.getNumericValue(Num.charAt(i)))==0)
            {
                res=res+1;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int num=121;    
        int val=countDigits(num);
        System.out.println(val);
    }
}
