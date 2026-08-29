class Solution {
    public int maximum69Number (int num) {
        String Num=String.valueOf(num);
        String Res="";
        boolean ch=false;
        for(int i=0;i<Num.length();i++)
        {
            if(Num.charAt(i)=='6' && ch==false)
            {
                Res=Res+'9';
                ch=true;
            }
            else
                Res=Res+Num.charAt(i);
        }
        return Integer.parseInt(Res);
    }
}
