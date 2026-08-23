class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int res=1;
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)==' ')
            {
                res=res+1;
                System.out.println(sentence.charAt(i+1));
            }
            if(searchWord.charAt(0)==sentence.charAt(i) && (i==0||sentence.charAt(i-1)==' '))
            {
                int ind1=i;
                int ind2=0;
                boolean found=true;
                while(ind2<searchWord.length() && ind1<sentence.length())
                {
                    if(searchWord.charAt(ind2)!=sentence.charAt(ind1))
                    {
                        found=false;
                        break;
                    }
                    else
                    {
                        System.out.println(searchWord.charAt(ind2)+" = "+sentence.charAt(ind1));
                    }
                    ind1=ind1+1;
                    ind2=ind2+1;
                    
                }
                if(found && ind2==searchWord.length())
                {
                    return res;
                }

            }
        }
        return -1;
    }
}
