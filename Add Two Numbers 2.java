/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;
class Solution {
    static ListNode sum=new ListNode(0,null);
    static ListNode sum2=new ListNode(0,null);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        //sum=new ListNode(l1.val+l2.val,null);
        sum=ListtoInt(l1,l2);
        return sum;
    }
    public static ListNode ListtoInt(ListNode l1,ListNode l2)
    {
        BigInteger sum=BigInteger.ZERO,n1=BigInteger.ZERO,n2=BigInteger.ZERO;
        String N1="",N2="";
        while(l1!=null || l2!=null)
        {
            if(l1!=null)
                N1=N1+l1.val;
            else if(l2!=null)
                N1=N1+'0';

            if(l2!=null)
                N2=N2+l2.val;
            else if(l1!=null)
                N2=N2+'0';

            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        //System.out.println(N1);
       // System.out.println(N2);
        
        n1=ReverseNum(N1);
        n2=ReverseNum(N2);
        //System.out.println(n1);
        sum=n1.add(n2);
        //sum=ReverseNum(sum););
        BigInteger temp=sum;
        BigInteger res=BigInteger.ZERO;
        res=temp.mod(BigInteger.valueOf(10));
        int val=res.intValue();
        sum2=new ListNode(val,null);
        temp=temp.divide(BigInteger.valueOf(10));
        while(temp.compareTo(BigInteger.ZERO) > 0)
        {
            Insert(sum2,temp.mod(BigInteger.TEN));
            temp=temp.divide(BigInteger.valueOf(10));
        }
        return sum2;
    }
    public static BigInteger ReverseNum(String num)
    {
        
        String Rev="";
        int i=0;
        while(i<num.length())
        {
            Rev=num.charAt(i)+Rev;
            i++;
        }
        BigInteger rev=new BigInteger(Rev);
        return rev;
    }
    public static void Insert(ListNode l,BigInteger num)
    {
        int n=num.intValue();
        ListNode temp=new ListNode(n);
        temp.next=null;
        while(l.next!=null)
        {
            l=l.next;
        }
        l.next=temp;
    }
}
