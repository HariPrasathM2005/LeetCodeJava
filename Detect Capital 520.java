public class DetectCapital520 
{
    public static boolean detectCapitalUse(String word)
    {
        boolean FirstAlone=true,AllCaps=true,AllSmall=true;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                if(i!=0)
                {
                    FirstAlone=false;
                }
                AllSmall=false;
            }
            else
            {
                AllCaps=false;
            }
        }
        if(FirstAlone || AllSmall || AllCaps)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        String s1="USA";
        String s2="Flag";
        String s3="leetcode";
        String s4="SdC";
        boolean val=detectCapitalUse(s4);
        System.out.println(val);
    }    
}
