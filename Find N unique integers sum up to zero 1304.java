class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        if(n%2==1)
        {
            int start=-(n/2);
            for(int i=0;i<res.length;i++)
            {
                res[i]=start;
                start=start+1;
            }
        }
        else if(n%2==0)
        {
            int start=-n/2;
            for(int i=0;i<n;i++)
            {
                res[i]=start;
                if(start+1==0)
                    start=start+2;
                else
                    start=start+1;
            }
        }
        return res;
    }
}
