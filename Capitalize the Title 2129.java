public class CapitalizetheTitle2129
{
    public static String capitalizeTitle(String title) 
    {
        String Res="";
        String[] words=title.split(" ");
        System.out.println(words.length);
        for(int i=0;i<words.length;i++)
        {
            words[i]=words[i].toLowerCase();
            String New=words[i].charAt(0)+"";
            if(words[i].length()>2)
            {
                New=Character.toUpperCase(words[i].charAt(0))+"";
            }
            for(int j=1;j<words[i].length();j++)
                New=New+words[i].charAt(j);
            Res=Res+New;
            if(i!=words.length-1)
                Res=Res+" ";
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        String title1="capiTalIze tHe titLe";
        String title2="First leTTeR of EACH Word";
        String res=capitalizeTitle(title2);
        System.out.println(res);    
    }
}
