public class Iterative_serach_ll {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int sz;
    // adding element in last of list
    public void addLast(int data){
     Node newNode=new Node(data);
     if(head==null){
        head=tail=newNode;
        return;
     }
     tail.next=newNode;
     tail=newNode;
    }
    // iterative search
    public void iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                System.out.print("Node found at "+i+ " : "+temp.data);
                return;

            }
                temp=temp.next;
                i++;
        }
        System.out.print("NOde not found");
    }
    // reverse a linked list
    public void reverseLinked(){
        Node curr=head;
        Node prev=null;
        tail=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // print a linked list

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    // kth node of list from last
    public void findNodeAtLast(int k){
        Node temp=head;
        while(temp!=null){
            temp =temp.next;
            sz++;
        }
        if(k==sz){
          head=head.next;
          return;
        }
        int i=1;
        int toFind=sz-k;
        Node prev=head;
        while(i<toFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {
     Iterative_serach_ll list=new Iterative_serach_ll();
     list.addLast(10);
     list.addLast(20);
     list.addLast(40);
     list.addLast(89);
     list.print();// 10->30->40->89->null
     //list.iterativeSearch(20);
     System.out.println();
     //list.reverseLinked();
     list.findNodeAtLast(2);
     list.print(); //10->30->89
    }
}
