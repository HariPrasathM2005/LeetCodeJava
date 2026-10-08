public class OddCounts1374 
{
    public static String generateTheString(int n) 
    {
        String Res="";
        if(n%2==0)
        {
            int len1=(n/2);
            int len2=(n/2);
            if(n>2 && len1%2==0)
            {
                len1=len1+1;
                len2=len2-1;
            }

            for(int i=0;i<len1;i++)
            {
                Res=Res+"a";
            }
            for(int i=0;i<len2;i++)
            {
                Res=Res+"b";
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                Res=Res+"a";
            }
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        int n1=3;
        int n2=1;
        int n3=4;
        int n4=10;
        int n5=2;
        String res=generateTheString(n5);
        System.out.println(res);        
    }
}
