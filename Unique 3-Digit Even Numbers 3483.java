import java.util.*;
public class Unique3DigitEvenNumber3483 
{
    public static int totalNumbers(int[] digits) 
    {
        int res=0;
        List<String> nums=new ArrayList<>();
        String Num="";
        for(int i=0;i<digits.length;i++)
        {
            nums.add(String.valueOf(digits[i]));
            Num=Num+String.valueOf(digits[i]);
        }
        List<String> pos=new ArrayList<>();
        for(int i=0;i<Num.length();i++)
        {
            for(int j=i;j<Num.length();j++)
            {
                
                pos.add(Num.substring(i, j+1));
            }
        }
        System.out.println(pos);
        return res;    
    }
    public static int build(int n1,int n2, int n3)
    {
        int num=n1;
        num=(num*10)+n2;
        num=(num*10)+n3;
        return num;
    }
    public static int totalNumbers2(int[] digits) 
    {
        int res=0;
        int num=0;
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<digits.length;i++)
        {
            for(int j=0;j<digits.length;j++)
            {
                for(int k=0;k<digits.length;k++)
                {
                    if(i!=j && i!=k && j!=k)
                    {
                        if(digits[i]!=0)
                        {
                            num=build(digits[i],digits[j],digits[k]);
                            if(!nums.contains(num))
                            {
                                if(num%2==0)
                                {
                                    res=res+1;
                                    System.out.println(num);
                                }
                                nums.add(num);
                            }
                        }         
                    }
                }
            }
        }
        return res;    
    }
    public static void main(String[] args) 
    {
        int[] nums={0,2,2};
        int res=totalNumbers2(nums);
        System.out.println(res);
    }    
}
