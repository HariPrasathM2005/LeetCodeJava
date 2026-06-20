public class Commonfactors2427 
{
    public static int Minimum(int a,int b)
    {
        if(a>=b)
            return a;
        else
            return b;
    }
    public static int commonfactors(int a,int b)
    {
        int res=0;
        int val=Minimum(a, b);
        for(int i=1;i<=val;i++)
        {
            if(a%i==0 && b%i==0)
                res=res+1;
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int a=25,b=30;   
        int val=commonfactors(a, b);
        System.out.println(val);
    }
}
