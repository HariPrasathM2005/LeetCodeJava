public class AlternatingBits693 
{
    public static String numtobin(int n)
    {
        String bin="";
        while(n>0)
        {
            if(n%2==0)
            {
                bin='0'+bin;
            }
            else if(n%2==1)
                bin='1'+bin;
            n=n/2;
        }
        return bin;
    }
    public static boolean hasAlternatingBits(int n)
    {
        String bin=numtobin(n);
        char prev=bin.charAt(0);
        for(int i=1;i<bin.length();i++)
        {
            if(bin.charAt(i)==prev)
            {
                return false;
            }
            prev=bin.charAt(i);
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int n=5;
        boolean res=hasAlternatingBits(n);
        System.out.println(res);
    }    
}
