public class CountPrimes204 
{
    public static boolean isprime(int n)
    {
        //boolean res=true;
        int ind=2,c=0;
        while(ind<=n/2)
        {
            if(n%ind==0)
            {
                return false;
            }
            ind=ind+1;
        }
        return true;
    }
    public static int CountPrimes(int n)
    {
        int res=0;
        for(int i=2;i<n;i++)
        {
            if(isprime(i))
            {
                res=res+1;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int n=14;
        int res=CountPrimes(n);
        System.out.println(res);
    }
}

/**
    public int countPrimes(int n) 
    {
        if (n <= 2) {
            return 0;
        }

        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
                for (long j = (long) i * i; j < n; j += i) {
                    isNotPrime[(int) j] = true;
                }
            }
        }
        return count;   
    }
     */
