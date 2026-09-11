import java.util.*;
public class CountNumberofTeam1395 
{
    public static int numTeams(int[] rating) 
    {
        int res=0;
        List<List<Integer>> teams=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        teams.clear();
        for(int i=0;i<rating.length;i++)
        {
            for(int j=0;j<rating.length;j++)
            {
                for(int k=0;k<rating.length;k++)
                {
                    if(i!=j && j!=k && i!=k)
                    {
                        if(rating[i]>rating[j] && rating[j]>rating[k] && i<j && j<k)
                        {
                            sub.add(rating[i]);
                            sub.add(rating[j]);
                            sub.add(rating[k]);
                            System.out.println(sub);
                            if(!teams.contains(sub))
                            {
                                teams.add(new ArrayList<>(sub));
                                res=res+1;
                            }
                            sub.clear();
                        }
                        else if(rating[k]>rating[j] && rating[j]>rating[i] && i<j && j<k)
                        {
                            sub.add(rating[i]);
                            sub.add(rating[j]);
                            sub.add(rating[k]);
                            if(!teams.contains(sub))
                            {
                                teams.add(new ArrayList<>(sub));
                                res=res+1;
                            }
                            sub.clear();
                        }
                    }
                }
            }
            System.out.println(teams);
        }
        return res;    
    }
    public static int numTeams2(int[] rating) 
    {
        int res=0;
        for(int i=0;i<rating.length;i++)
        {
            for(int j=0;j<rating.length && j!=i;j++)
            {
                for(int k=0;k<rating.length && k!=i && k!=j;k++)
                {
                    if(rating[i]>rating[j] && rating[j]>rating[k])
                    {
                        res=res+1;
                    }
                    else if(rating[k]>rating[j] && rating[j]>rating[i])
                    {
                        res=res+1;
                    }
                }
            }
        }
        return res;    
    }
    public static void main(String[] args) 
    {
        int[] nums={2,5,3,4,1};
        int[] nums2={2,1,3};
        int[] nums3={1,2,3,4};
        int res=numTeams2(nums2);
        System.out.println(res);    
    }
}
