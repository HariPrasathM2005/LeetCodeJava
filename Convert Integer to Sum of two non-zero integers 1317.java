class Solution {
    public static boolean containszero(int n)
    {
        while(n>0)
        {
            if(n%10==0)
                return true;
            n=n/10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[2];
        int start=1;
        while(true)
        {
            if(containszero(start)==false && containszero(n-start)==false)
            {
                res[0]=start;
                res[1]=n-start;
                return res;
            }
            start=start+1;
        }
    }
}
