public class MergeStrings1768 
{
    public static String mergeAlternately(String word1, String word2) 
    {
        String Res="";
        int i;
        int len=(word1.length()<word2.length()) ? word1.length():word2.length();
        for(i=0;i<len;i++)
        {
            Res=Res+word1.charAt(i);
            Res=Res+word2.charAt(i);
        }
        if(word1.length()>word2.length())
        {
            while(i<word1.length())
            {
                Res=Res+word1.charAt(i);
                i=i+1;
            }
        }
        else
        {
            while(i<word2.length())
            {
                Res=Res+word2.charAt(i);
                i=i+1;
            }
        }
        return Res;    
    }
    public static void main(String[] args) 
    {
        String word1="abcde";
        String word2="pqrs";
        String Res=mergeAlternately(word1, word2);
        System.out.println(Res);
    }    
}
