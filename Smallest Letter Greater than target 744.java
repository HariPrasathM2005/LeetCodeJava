import java.util.*;
public class SmallestLetter744
{
    public static void Display(char[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static char nextGreatestLetter(char[] letters, char target) 
    {
        boolean present=false;
        Arrays.sort(letters);
        char Res=letters[0];
        Display(letters);
        //char ch='A';
        int val=Character.valueOf(target);
        //System.out.println(val);
        if(target=='z' || target==letters[letters.length-1])
            return letters[0];
        for(int i=0;i<letters.length;i++)
        {
            if(val<Character.valueOf(letters[i]))
            {
                return letters[i];
            }
            if(letters[i]==target)
            {
                present=true;
            }
            if(present)
            {
                if(letters[i]!=target)
                    return letters[i];
            }
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        char[] s={'c','f','j'};
        char target='f';
        char Res=nextGreatestLetter(s, target);
        System.out.println(Res);
    }
}
