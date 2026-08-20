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
class Solution {
    static String bin="";
    static int num=0;
    static ListNode p=null;
    public static void toint()
    {
        int mul=1;
        num=0;
        //System.out.println(bin);
        for(int i=bin.length()-1;i>=0;i--)
        {
            if(bin.charAt(i)=='1')
            {
                num=num+(mul*1);

                //System.out.println("Num:"+num);
            }
            mul=mul*2;
        }
        //System.out.println(num);
    
    }
    public static void Traverse(ListNode T)
    {
        if(T==null)
        {
            bin=String.valueOf(0);
            return;
        }
        p=T;
       // System.out.println(bin);
        while(p!=null)
        {
            //System.out.println(p.val);
            bin=bin+String.valueOf(p.val);
            p=p.next;
        }
       // System.out.println(bin);
    }
    public int getDecimalValue(ListNode head) {
        bin="";
        num=0;

        Traverse(head);
        toint();
        return num;
    }
}
