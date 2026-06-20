public class MaximumNumber2114
{
    public static int mostWordsFound(String[] sentences) 
    {
        int Max=0,c;
        String[] words;
        for(int i=0;i<sentences.length;i++)
        {
            words=sentences[i].split(" ");
            c=words.length;
            if(Max<c)
                Max=c;
        }
        return Max;    
    }
    public static void main(String[] args) 
    {
        String[] inp={"Hello World","Welcome to Java"};
        int res=mostWordsFound(inp);
        System.out.println(res);
    }
}
