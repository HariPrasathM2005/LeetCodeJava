class Solution {
    static long num=0;
    static long lowerlim=0;
    public static int digitLen(long n)
    {
        int len=0;
        while(n>0)
        {
            len=len+1;
            n=n/10;
        }
        return len;
    }
    public static long lower(int c)
    {
        long res=1;
        for(int i=0;i<c;i++)
        {
            res=res*1000;
        }
        return res;
    }
    public static long Commas(long n)
    {
        long res=0;
        int len=digitLen(n);
        int c=(len-1)/3;
        lowerlim=lower(c);
        res=res+(c*((n-lowerlim)+1));
        return res;
    }
    public long countCommas(long n) {
        if(n<1000)
            return 0;
        long res=0;
        num=n;

        while(num>=1000)
        {
            res=res+Commas(num);
            num=lowerlim-1;
        }
        
        return res;
    }
}
