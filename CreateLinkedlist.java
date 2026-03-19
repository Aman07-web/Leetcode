public class CreateLinkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add element at first position

    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int idx,int data){
        Node newNode=new Node(data);
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while( i < idx-1 ){
        temp=temp.next;
        i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print(){
      Node temp=head;
      while (temp!=null) {
        System.out.print(temp.data + " -> ");
        temp=temp.next;
      }
    }

    public static void main(String[] args) {
        CreateLinkedlist ll = new CreateLinkedlist();
        ll.addFirst(10);
        ll.addFirst(30);
        ll.addLast(60);
        ll.addFirst(5);
        ll.addMiddle(2,45);
        ll.print();
    }
}
