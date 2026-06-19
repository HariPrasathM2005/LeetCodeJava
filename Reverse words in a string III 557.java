public class ReverseWords557 
{
    public static String Reverse2(String word)
    {
        String Res="";
        String temp="";
        //StringBuilder Temp=new StringBuilder();
        String[] arr=word.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                temp=arr[i].charAt(j)+temp;
            }
            if(i!=arr.length-1)
                Res=Res+temp+" ";
            else
                Res=Res+temp;
            temp="";
        }   
        System.out.println(Res);
        return Res;
    }
    public static void main(String[] args) 
    {
        String s="Geeks for Geeks";
        String rev;
        rev=Reverse2(s);
        System.out.println(rev);

    }
}
