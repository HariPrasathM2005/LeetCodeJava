import java.util.*;

class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class SortList148 
{
    static ListNode head=null;
    static ListNode temp=null;
    static ListNode p=null;
    public static List<Integer> toList(ListNode head)
    {
        List<Integer> Nums=new ArrayList<>();
        if(head==null)
        {
            return Nums;
        }
        p=head;
        while(p!=null)
        {
            Nums.add(p.val);
            p=p.next;
        }
        return Nums;
    }
    public static ListNode sortList(ListNode head) 
    {
        List<Integer> Nums=toList(head);
        //System.out.println(Nums);
        Collections.sort(Nums);
        //System.out.println(Nums);
        head=ListtoNode(Nums);
        //Display();
        return head;
    }
    public static ListNode ListtoNode(List<Integer> A)
    {
        if(head==null)
            return head;
        p=head;
        int c=0;
        while(p!=null)
        {
            p.val=A.get(c);
            p=p.next;
            c=c+1;
        }
        return head;
    }
    public static void Insert(int val)
    {
        ListNode temp=new ListNode(val);
        temp.next=null;
        if(head==null)
        {
            head=temp;
            return;
        }
        p=head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=temp;
    }
    public static void Display()
    {
        if(head==null)
            return;
        p=head;
        while(p!=null)
        {
            System.out.print(p.val+" ");
            p=p.next;
        }
    }
    public static void main(String[] args) 
    {
        Insert(5);
        Insert(2);
        Insert(10);
        Insert(1);
        //Display();
        head=sortList(head);
    }
    
}
