class Solution {
    public static double slope(int[] P1,int[] P2)
    {
        double slope=1000;
        if(P2[0]!=P1[0])
            slope=(double)(P2[1]-P1[1])/(P2[0]-P1[0]);
        return slope;
    }
    public boolean checkStraightLine(int[][] coordinates) {
        double val=slope(coordinates[0],coordinates[1]);
        int x=coordinates[0][0];
        boolean same=true;
        for(int i=0;i<coordinates.length;i++)
        {
            if(x!=coordinates[i][0])
                same=false;
        }
        if(same)
            return true;
        for(int i=0;i<coordinates.length-1;i++)
        {

            double curr=slope(coordinates[i],coordinates[i+1]);
            System.out.println(curr);
            if(val!=curr)
            {
                return false;
            }
            val=curr;
        }
        return true;
    }
}
