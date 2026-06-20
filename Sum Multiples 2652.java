public class SumMultiples2652 
{
    public static int sumOfMultiples(int n)
    {
        int res=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            {
                res=res+i;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int n=7;    
        int val=sumOfMultiples(n);
        System.out.println(val);
    }
}
