public class HammingDistance461 
{
    public static String ToBinary(int n)
    {
        String res="";
        while(n>0)
        {
            if(n%2==0)
                res='0'+res;
            else
                res='1'+res;
            n=n/2;
        }
        while(res.length()<32)
        {
            res=String.valueOf(0)+res;
        }
        System.out.println(res);
        return res;
    }
    public static int hammingDistance(int x, int y)
    {
        String b1,b2;
        b1=ToBinary(x);
        b2=ToBinary(y);
        int res=0;
        for(int i=0;i<b1.length();i++)
        {
            if(b1.charAt(i)!=b2.charAt(i))
                res=res+1;
        }
        return res;
    }
    public static void main(String[] args) {
        int n1=1,n2=4;
        int res=hammingDistance(n1, n2);
        System.out.println(res);

    }
    
}
