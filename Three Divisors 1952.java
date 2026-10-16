public class ThreeDivisor1952 
{
    public static boolean isThree(int n) 
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c=c+1;
        }
        if(c==3)
            return true;
        return false;
    }
    public static void main(String[] args) 
    {
        int n1=2;
        int n2=4;
        boolean res=isThree(n2);
        System.out.println(res);
    }
}
