public class Numberofbits191 
{
    public static int hammingWeight(int n) 
    {
        if(n==0)
            return 0;
        int res=0;
        while(n>0)
        {
            if(n%2==1)
                res=res+1;
            n=n/2;
        }
        return res;    
    }
    public static void main(String[] args) 
    {
        int n=2147483645;    
        int res=hammingWeight(n);
        System.out.println(res);
    }    
}
