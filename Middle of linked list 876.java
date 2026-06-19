class ListNode
{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Middleoflinkedlist876 
{
    static ListNode head=null;
    static ListNode Temp=null;
    static ListNode p=null;

    static ListNode Res=null;
    public static void Insert(int d)
    {
        ListNode Temp=new ListNode(d);
        Temp.next=null;
        if(head==null)
        {
            head=Temp;
            return;
        }
        p=head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=Temp;
    }
    public static void Display()
    {
        if(head==null)
        {
            return;
        }
        p=head;
        while(p!=null)
        {
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static void Display(ListNode A)
    {
        if(A==null)
        {
            return;
        }
        p=A;
        while(p!=null)
        {
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static ListNode FindMiddle()
    {
        if(head==null)
        {
            return null;
        }
        p=head;
        int c=0;
        while(p!=null)
        {
            c=c+1;
            p=p.next;
        }
        //System.out.println("Length:"+c);
        p=head;
        int ind=0;
        while(p!=null)
        {
            ind=ind+1;
            p=p.next;
            if(ind==c/2)
            {
                return p;
            }
        }
        return p;

    }
    public static void main(String[] args) 
    {

        Insert(1);
        Insert(2);
        Insert(3);
        Insert(4);
        Insert(5);
        Display();
        Res=FindMiddle();
        Display(Res);
    }
    
}
