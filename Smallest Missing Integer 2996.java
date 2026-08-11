class Solution {
    
    public static int Total(List<Integer> A)
    {
        int tot=0;
        for(int i=0;i<A.size();i++)
        {
            tot=tot+A.get(i);
        }
        return tot;
    }
    public static int Lookup(List<Integer> A,int n)
    {
        if(!A.contains(n))
        {
            return n;
        }
        else
        {
            while(A.contains(n))
            {
                n++;
            }
            return n;
        }
    }
    public int missingInteger(int[] nums) {
        List<Integer> sub=new ArrayList<>();
        boolean equals=false;
        if(nums.length==1)
            return nums[0]+1;
        for(int i=0;i<nums.length-1;i++)
        {
            //System.out.println(nums[i]+" "+nums[i+1]);
            if(nums[i]+1==(nums[i+1]))
            {
                sub.add(nums[i]);
                equals=true;
            }
            else
            {
                sub.add(nums[i]);
                equals=false;
                break;
            }
        }
        if(equals)
        {
            sub.add(nums[nums.length-1]);
        };
        
        int sum=Total(sub);
        List<Integer> sub2=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            sub2.add(nums[i]);
        int Res=Lookup(sub2,sum);
        return Res;
    }
}
