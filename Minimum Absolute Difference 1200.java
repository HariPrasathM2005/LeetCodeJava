class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> Res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        int mindiff=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            sub.clear();
            if(mindiff>=(arr[i+1]-arr[i]))
            {
                sub.add(arr[i]);
                sub.add(arr[i+1]);
                Res.add(new ArrayList<>(sub));
                mindiff=arr[i+1]-arr[i];
            }
        }
        for(int i=0;i<Res.size();i++)
        {
            if(mindiff<(Res.get(i).get(1)-Res.get(i).get(0)))
            {
                System.out.println(Res.get(i).get(0)+ " "+Res.get(i).get(1));
                Res.remove(i);
                i=i-1;
            }
        }
        return Res;
    }
}
