public class FirstPalindrome2108 
{
    public static boolean isPalindrome(String word)
    {
        String res="";
        for(int i=0;i<word.length();i++)
        {
            res=word.charAt(i)+res;
        }
        if(res.equals(word))
            return true;
        else
            return false;
    }
    public static String stringfirstPalindrome(String[] words)
    {
        String res="";
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))
            {
                res=words[i];
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        String[] inp={"hi","racecar"};    
        String res=stringfirstPalindrome(inp);
        System.out.println(res);
    }
    
}
