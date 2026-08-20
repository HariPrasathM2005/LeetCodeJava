class Solution {
    public String freqAlphabets(String s) {
        char[] alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int num=0;
        int i=s.length()-1;
        String res="";
        boolean found=false;
        while(i>=0)
        {
            if(s.charAt(i)!='#' && found==false)
            {
                String ch=""+s.charAt(i);
                num=Integer.parseInt(ch);
                //System.out.println("First:"+alpha[num-1]);
                res=alpha[num-1]+res;
            
            }
            else if(!found)
            {
                found=true;
                //System.out.println("second");
            }
            else if(found)
            {
                String ch=""+s.charAt(i-1)+s.charAt(i);
                num=Integer.parseInt(ch);
                //System.out.println("Third:"+alpha[num-1]);
                i=i-1;
                res=alpha[num-1]+res;
                found=false;
            }
            i=i-1;
        }
        return res;
    }
}
