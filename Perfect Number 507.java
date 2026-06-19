public class PerfectNumber507 
{
    public static void CheckPerfect(int num)
    {
        int Sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                Sum=Sum+i;
            }
        }
        if(num==Sum)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
    public static void main(String[] args) 
    {
        int num=28;    
        CheckPerfect(num);
    }
    
}
