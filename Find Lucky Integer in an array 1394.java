class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==arr[i] && !nums.contains(arr[i]))
            {
                nums.add(arr[i]);
            }
        }
        //System.out.println(map);
        nums.sort(null);
        if(nums.size()!=0)
            return nums.get(nums.size()-1);
        else
            return -1;
    }
}
