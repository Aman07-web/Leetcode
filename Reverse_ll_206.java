public class Reverse_ll_206 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
   public static Node head;
   public static Node tail;

   public void addLast(int data){
   Node newNode=new Node();
   if(head==null){
    head=tail=newNode;
    return;
   }
   newNode.next=tail.next;
   tail=newNode;
   }
   public void print(){
    Node temp=head;
    while(head!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }

   }
    public static void main(String[] args) {
    Reverse_ll_206 ll=new Reverse_ll_206();
      ll.addLast(10);
      ll.addLast(20);
      ll.addLast(30);
      ll.addLast(40);
      ll.print();
    }
}
