public class SmallestDivisibleDigit3345
{
    public static int Product(int num)
    {
        int Res=1;
        while(num>0)
        {
            Res=Res*(num%10);
            num=num/10;
        }
        return Res;
    }
    public static int smallestNumber(int n, int t) 
    {
        int Res=n;
        int prd=Product(Res);
        while(prd%t!=0)
        {
            Res=Res+1;
            prd=Product(Res);
        }
        return Res;
    }
    public static void main(String[] args)
    {
        int Res=smallestNumber(15, 4);
        System.out.println(Res);
    }
}
