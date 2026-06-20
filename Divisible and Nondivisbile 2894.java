public class DivisbleandNondivisible2894 
{
    public static int differenceOfSums(int n, int m)
    {
        int res=0,divisible=0,nondivisible=0;
        int[] arr=new int[n];
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
            {
                nondivisible=nondivisible+i;
            }
            else
                divisible=divisible+i;
        }
        res=nondivisible-divisible;
        return res;
    }
    public static void main(String[] args) 
    {
        int n=10,m=3;
        int val=differenceOfSums(n, m);
        System.out.println(val);
    }
}
