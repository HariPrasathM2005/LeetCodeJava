class ListNode
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class RotateList61 
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
    public static ListNode Rotate(ListNode head)
    {
        if(head==null)
            return null;
        p=head;
        if(p.next==null)
            return head;
        while(p.next.next!=null)
            p=p.next;
        temp=new ListNode(p.next.val);
        p.next=null;
        temp.next=head;
        head=temp;
        return head;
    }
    public static ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null)
            return null;
        FindLength(head);
        shift=k%Length;
        for(int i=0;i<shift;i++)
        {
            head=Rotate(head);
        }
        return head;
    }
    public static void main(String[] args) 
    {
        Insert(1);
        Insert(2);
        Insert(3);
        Insert(4);
        Insert(5);
        ListNode Res=rotateRight(head, 2);
        Display(Res);
    }
}
