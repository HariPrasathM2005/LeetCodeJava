import java.util.*;
class ListNode
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class InsertionSort147 
{
    static ListNode head=null;
    static ListNode temp=null;
    static ListNode p=null;
    static int Length=0;
    static int shift=0;
    public static void Insert(int d)
    {
        temp=new ListNode(d);
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
    public static ListNode Insert(ListNode head,int d)
    {
        temp=new ListNode(d);
        temp.next=null;
        if(head==null)
        {
            head=temp;
            return head;
        }
        p=head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=temp;
        return head;
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
        System.out.println();
    }
    public static void Display(ListNode head)
    {
        if(head==null)
            return;
        p=head;
        while(p!=null)
        {
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static void FindLength(ListNode head)
    {
        if(head==null)
        {
            Length=0;
            return;
        }
        p=head;
        while(p!=null)
        {
            Length=Length+1;
            p=p.next;
        }
    }
    public static ListNode insertionSortList(ListNode head) 
    {
        Length=0;
        FindLength(head);
        //System.out.println(Length);
        int[] arr=new int[Length];
        p=head;
        int i=0;
        while(p!=null)
        {
            arr[i]=p.val;
            p=p.next;
            i++;
        }
        Arrays.sort(arr);
        ListNode Res=null;
        for(int j=0;j<arr.length;j++)
        {
            Res=Insert(Res,arr[j]);
        }
        return Res;    
    }
    public static void main(String[] args) 
    {
        Insert(5);
        Insert(4);
        Insert(3);
        Insert(1);
        Insert(2);
        Display(head);
        ListNode Res=insertionSortList(head);
        Display(Res);
    }
}
