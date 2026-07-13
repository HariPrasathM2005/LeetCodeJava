import java.util.*;
public class SequentialDigits1291
{
    public static Boolean isSequence(int num)
    {
        int m,prev=num%10;
        num=num/10;
        while(num>0)
        {
            if(prev!=(num%10)+1)
                return false;
            prev=num%10;
            num=num/10;
        }

        return true;
    }
    public static List<Integer> Generate(int low,int high)
    {
        List<Integer> Res=new ArrayList<>();
        int start=1,num=0;
        int digitcount=2;
        while(num<=high)
        {
            int j=1;
            if(start>9)
            {
                start=1;
                digitcount=digitcount+1;
                
            }
            start=start-digitcount+1;
            if(start==9)
                break;
            while(j<=digitcount)
            {
                
                if(start>9)
                {
                    start=1;
                    digitcount=digitcount+1;
                    break;
                }
                num=(num*10)+start;
                start++;
                j++;
                
            }
            //System.out.println(num);
            if(String.valueOf(num).charAt(0)=='9')
                break;
            if(num>=low && num<=high)
            {
                if(!Res.contains(num))
                    Res.add(num);
                num=0;
            }
            else if(num<=low && num<=high)
            {
                //start++;
                num=0;
            }
            else if(num>high)
            {
                break;
            }
        }
        return Res;
    }
    public static List<Integer> sequentialDigits(int low, int high) 
    {
        List<Integer> Res=new ArrayList<>();
        int i=low;
        while(i<high)
        {
            System.out.println(i);
            if(isSequence(i))
            {
                System.out.println("Found: "+i);
                Res.add(i);
                String Num=String.valueOf(i);
                i=i+(int)Math.pow(10,(Num.length()-1));
                
            }
            else
                i=i+1;
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        int low=89,high=234;
        List<Integer> Res=Generate(low,high);
        System.out.println(Res);       
    }
}
