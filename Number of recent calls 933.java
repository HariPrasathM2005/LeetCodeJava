class RecentCounter {
    static List<Integer> nums=new ArrayList<>();
    static int upper=0;
    static int lower=0;
    public RecentCounter() {
        nums.clear();
    }
    
    public int ping(int t) {
        nums.add(t);
        upper=t;
        lower=t-3000;
        int res=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)>=lower && nums.get(i)<=upper)
                res=res+1;
        }
        return res;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
