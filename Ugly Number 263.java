public class UglyNumber263 
{
    public static boolean isUgly(int n)
    {
        boolean res=true;
        int num=n,ind=0;
        while(num!=1 && ind<=n)
        {
            if(num%2==0)
            {
                num=num/2;
            }
            else if(num%3==0)
            {
                num=num/3;
            }
            else if(num%5==0)
            {
                num=num/5;
            }
            else
                return false;
            if(num==1)
                break;
            ind=ind+1;
        }
        if(num==1)
            res=true;
        else
            res=false;
        //System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        int n=30;
        boolean res=isUgly(n);
    }    
}
