public class Reverseonlyletter917 
{
    public static String Rev(String s)
    {
        String Res="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
                Res=s.charAt(i)+Res;
        }
        return Res;
    }
    public static String reverseOnlyLetters(String s) 
    {
        String Res="",temp="";
        temp=Rev(s);
        int ind=0;
        //System.out.println(temp);
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isLetter(s.charAt(i)))
            {
                Res=Res+s.charAt(i);
            }
            else
            {
                Res=Res+temp.charAt(ind);
                ind=ind+1;
            }
            //System.out.println(Res);
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        String s="a-bC-dEf-ghIj";
        String Res=reverseOnlyLetters(s);
        System.out.println(Res);
    }
    
}
