import java.util.*;
public class JewelsandStones771 
{
    public static int numJewelsInStones(String jewels, String stones) 
    {
        int Res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<stones.length();i++)
        {
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0)+1);
        }
        //System.out.println(map);
        for(int i=0;i<jewels.length();i++)
        {
            if(map.containsKey(jewels.charAt(i)))
                Res=Res+map.get(jewels.charAt(i));
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        String jewel="aA";
        String stones="aaAAB";
        int Res=numJewelsInStones(jewel,stones);
        System.out.println(Res);
    }
}
