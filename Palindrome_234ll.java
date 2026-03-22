public class Palindrome_234ll {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;

 // add element at the end of list
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
   
// print limked list
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" "+"->");
            temp=temp.next;
        }
    }
// find mid value
    public Node midValue(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
        }
        return slow;
       // System.out.print("Mid value is : "+slow.data);
    }
// check palindrome

  public boolean checkPalindrome(){
    if(head==null && head.next==null){
       return true;
    }
    // mid node
    Node midNode=midValue(head);
    // reverse 2nd half
    Node prev=null;
    Node curr=midNode;
    Node next;
    while(curr!=null){
     next=curr.next;
     curr.next=prev;
     prev=curr;
     curr=next;
    }
// compare each half
    Node right=prev;  // right half
    Node left=head; // left half

    while(right!=null){
        if(right.data!=left.data){
            return false;
        }
        right=right.next;
        left=left.next;
    }
    return true;
  }    

    public static void main(String[] args) {
        Palindrome_234ll ll=new Palindrome_234ll();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);
        ll.print(); // 1->2->2->1->
        System.out.println();
        //ll.midValue();
        System.out.print(ll.checkPalindrome());

    }
}
