public class Subtractproductandsum1281 
{
    public static int subtractProductAndSum(int n)
    {
        int Res=0,Product=1,Sum=0;
        while(n>0)
        {
            Product=Product*(n%10);
            Sum=Sum+(n%10);
            n=n/10;
        }
        Res=Product-Sum;
        if(Res<0)
            Res=-Res;
        return Res;
    }
    public static void main(String[] args) 
    {
        int num=234;    
        int val=subtractProductAndSum(num);
        System.out.println(val);
    }
    
}
